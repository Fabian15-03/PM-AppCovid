package pe.edu.ulima.pm.appcovid19.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom


@Dao
interface CovidRoomDAO {
    @Query("SELECT * FROM CovidRoom")
    fun getAll() : List<CovidRoom>

    @Query("SELECT * FROM Covidroom WHERE id=:id")
    fun findById(id : Int) : CovidRoom

    @Insert
    fun insert(caso : CovidRoom)

    @Delete
    fun delete(caso: CovidRoom)
}