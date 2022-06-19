package pe.edu.ulima.pm.appcovid19.room.dao

import androidx.room.Dao
import androidx.room.Query
import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom


@Dao
interface CovidRoomDao {
    @Query("")
    fun getPersonInDate():List<CovidRoom>
}