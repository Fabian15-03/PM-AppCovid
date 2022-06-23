package pe.edu.ulima.pm.appcovid19.models

import android.content.Context
import pe.edu.ulima.pm.appcovid19.room.AppDatabase
import pe.edu.ulima.pm.appcovid19.room.dao.CovidRoomDAO
import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom


class GestorCovid {

    fun obtenerListaCovidRoom(context : Context) : List<CovidRoom> {
        val daoCovid : CovidRoomDAO = AppDatabase.getInstance(
            context).getCovidRoomDao()

        val listaCovidRoom = daoCovid.getAll() // consulta Room
        println(listaCovidRoom.size)
        val listaCovid = listaCovidRoom.map {
            CovidRoom(it.nombre, it.terreno, it.poblacion)
        }
        return listaCovid
    }

    fun guardarListaCovidRoom(context : Context, planetas : List<CovidRoom>) {

        val db = AppDatabase.getInstance(
            context)
        val daoCovid : CovidRoomDAO = db.getCovidRoomDao()

        covid.forEach {
            daoCovid.insert(
                CovidRoom(0, it.nombre, it.terreno, it.poblacion)
            )
        }

    }

}