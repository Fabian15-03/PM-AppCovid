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
        return "INSERT OR ABORT INTO `CovidRoom` (`id`,`nombre`,`terreno`,`poblacion`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CovidRoom value) {
        stmt.bindLong(1, value.getId());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        if (value.getTerreno() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTerreno());
        }
        if (value.getPoblacion() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPoblacion());
        }
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
  public void insert(final CovidRoom planeta) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCovidRoom.insert(planeta);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CovidRoom planeta) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCovidRoom.handle(planeta);
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
      final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
      final int _cursorIndexOfTerreno = CursorUtil.getColumnIndexOrThrow(_cursor, "terreno");
      final int _cursorIndexOfPoblacion = CursorUtil.getColumnIndexOrThrow(_cursor, "poblacion");
      final List<CovidRoom> _result = new ArrayList<CovidRoom>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CovidRoom _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNombre;
        if (_cursor.isNull(_cursorIndexOfNombre)) {
          _tmpNombre = null;
        } else {
          _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
        }
        final String _tmpTerreno;
        if (_cursor.isNull(_cursorIndexOfTerreno)) {
          _tmpTerreno = null;
        } else {
          _tmpTerreno = _cursor.getString(_cursorIndexOfTerreno);
        }
        final String _tmpPoblacion;
        if (_cursor.isNull(_cursorIndexOfPoblacion)) {
          _tmpPoblacion = null;
        } else {
          _tmpPoblacion = _cursor.getString(_cursorIndexOfPoblacion);
        }
        _item = new CovidRoom(_tmpId,_tmpNombre,_tmpTerreno,_tmpPoblacion);
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
      final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "nombre");
      final int _cursorIndexOfTerreno = CursorUtil.getColumnIndexOrThrow(_cursor, "terreno");
      final int _cursorIndexOfPoblacion = CursorUtil.getColumnIndexOrThrow(_cursor, "poblacion");
      final CovidRoom _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNombre;
        if (_cursor.isNull(_cursorIndexOfNombre)) {
          _tmpNombre = null;
        } else {
          _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
        }
        final String _tmpTerreno;
        if (_cursor.isNull(_cursorIndexOfTerreno)) {
          _tmpTerreno = null;
        } else {
          _tmpTerreno = _cursor.getString(_cursorIndexOfTerreno);
        }
        final String _tmpPoblacion;
        if (_cursor.isNull(_cursorIndexOfPoblacion)) {
          _tmpPoblacion = null;
        } else {
          _tmpPoblacion = _cursor.getString(_cursorIndexOfPoblacion);
        }
        _result = new CovidRoom(_tmpId,_tmpNombre,_tmpTerreno,_tmpPoblacion);
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
