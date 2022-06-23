package pe.edu.ulima.pm.appcovid.models

import android.content.Context
import pe.edu.ulima.pm.appcovid19.room.AppDatabase
import pe.edu.ulima.pm.appcovid19.room.modules.CovidRoom
import android.os.Handler
import android.util.Log
import pe.edu.ulima.pm.appcovid.models.beans.Covid
import pe.edu.ulima.pm.appcovid19.room.dao.CovidRoomDAO


class GestorCovid {

    val handler : Handler = Handler()

    fun obtenerListaCovidRoom(context : Context) : List<Covid> {
        val daoCovid : CovidRoomDAO = AppDatabase.getInstance(
            context).getCovidRoomDao()

        val listaCovidRoom = daoCovid.getAll() // consulta Room
        println(listaCovidRoom.size)
        val listCovid = listaCovidRoom.map {
            Covid(it.fecha_corte, it.departamento, it.fecha_resultado)
        }
        return listCovid

    }

    fun guardarListaCovidRoom(context : Context, planetas : List<Covid>) {

        val db = AppDatabase.getInstance(
            context)
        val daoCovid : CovidRoomDAO = db.getCovidRoomDao()

        planetas.forEach {
            daoCovid.insert(
                CovidRoom(0, it.fecha_corte, it.departamento, it.fecha_resultado)
            )
        }

    }



}