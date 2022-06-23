package pe.edu.ulima.pm.appcovid19.room.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CovidRoomDAO_Impl implements CovidRoomDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CovidRoom> __insertionAdapterOfCovidRoom;

  private final EntityDeletionOrUpdateAdapter<CovidRoom> __deletionAdapterOfCovidRoom;

  public CovidRoomDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCovidRoom = new EntityInsertionAdapter<CovidRoom>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CovidRoom` (`id`,`fecha_corte`,`departamento`,`fecha_resultado`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CovidRoom value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getFecha_corte());
        if (value.getDepartamento() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDepartamento());
        }
        stmt.bindLong(4, value.getFecha_resultado());
      }
    };
    this.__deletionAdapterOfCovidRoom = new EntityDeletionOrUpdateAdapter<CovidRoom>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CovidRoom` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CovidRoom value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final CovidRoom caso) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCovidRoom.insert(caso);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CovidRoom caso) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCovidRoom.handle(caso);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<CovidRoom> getAll() {
    final String _sql = "SELECT * FROM CovidRoom";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFechaCorte = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_corte");
      final int _cursorIndexOfDepartamento = CursorUtil.getColumnIndexOrThrow(_cursor, "departamento");
      final int _cursorIndexOfFechaResultado = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_resultado");
      final List<CovidRoom> _result = new ArrayList<CovidRoom>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CovidRoom _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpFecha_corte;
        _tmpFecha_corte = _cursor.getInt(_cursorIndexOfFechaCorte);
        final String _tmpDepartamento;
        if (_cursor.isNull(_cursorIndexOfDepartamento)) {
          _tmpDepartamento = null;
        } else {
          _tmpDepartamento = _cursor.getString(_cursorIndexOfDepartamento);
        }
        final int _tmpFecha_resultado;
        _tmpFecha_resultado = _cursor.getInt(_cursorIndexOfFechaResultado);
        _item = new CovidRoom(_tmpId,_tmpFecha_corte,_tmpDepartamento,_tmpFecha_resultado);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CovidRoom findById(final int id) {
    final String _sql = "SELECT * FROM Covidroom WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFechaCorte = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_corte");
      final int _cursorIndexOfDepartamento = CursorUtil.getColumnIndexOrThrow(_cursor, "departamento");
      final int _cursorIndexOfFechaResultado = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha_resultado");
      final CovidRoom _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpFecha_corte;
        _tmpFecha_corte = _cursor.getInt(_cursorIndexOfFechaCorte);
        final String _tmpDepartamento;
        if (_cursor.isNull(_cursorIndexOfDepartamento)) {
          _tmpDepartamento = null;
        } else {
          _tmpDepartamento = _cursor.getString(_cursorIndexOfDepartamento);
        }
        final int _tmpFecha_resultado;
        _tmpFecha_resultado = _cursor.getInt(_cursorIndexOfFechaResultado);
        _result = new CovidRoom(_tmpId,_tmpFecha_corte,_tmpDepartamento,_tmpFecha_resultado);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
