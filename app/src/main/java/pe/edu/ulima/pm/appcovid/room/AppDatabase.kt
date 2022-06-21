package pe.edu.ulima.pm.appcovid19.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import pe.edu.ulima.pm.appcovid19.room.dao.CovidRoomDAO

import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom


@Database(entities = arrayOf(CovidRoom :: class),version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getCovidRoomDao() : CovidRoomDAO

    companion object {
        private var mInstance : AppDatabase ? = null
                fun getInstance(context: Context) : AppDatabase {
                    if (mInstance == null) {
                        mInstance = Room.inMemoryDatabaseBuilder(
                            context.applicationContext,
                            AppDatabase :: class.java
                        ).allowMainThreadQueries().build()
                    }
                    return  mInstance!!
                }
    }
}