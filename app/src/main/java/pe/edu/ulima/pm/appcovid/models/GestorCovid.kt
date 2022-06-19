package pe.edu.ulima.pm.appcovid19.models

import android.content.Context
import pe.edu.ulima.pm.appcovid19.room.AppDatabase
import pe.edu.ulima.pm.appcovid19.room.dao.CovidRoomDao
import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom
import android.os.Handler
import android.util.Log




class GestorCovid {
    fun obtenerListaCovidRoom(context : Context) : List<CovidRoom> {
        val daoCovid : CovidRoomDao = AppDatabase.getInstance(
            context).getCovidRoomDao()

        val listaPlanetasRoom = daoCovid.getAll() // consulta Room
        println(listaPlanetasRoom.size)
        val listaCovid = listaPlanetasRoom.map {
            Covid(it.nombre, it.terreno, it.poblacion)
        }
        return listaCovid
    }

}