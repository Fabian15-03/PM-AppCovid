package pe.edu.ulima.pm.appcovid.networking

import pe.edu.ulima.pm.appcovid.models.beans.Covid
import retrofit2.Call
import retrofit2.http.GET

interface CovidService {
    @GET
    fun obtenerData():Call<List<Covid>>
}