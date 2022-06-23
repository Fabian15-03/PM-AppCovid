package pe.edu.ulima.pm.appcovid.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class NetworkingManager(val service : CovidService) {
    companion object {
        private var instance: NetworkingManager? = null

        fun getInstance(): NetworkingManager {
            if (instance == null) {
                //retrofit
                val retrofit : Retrofit = Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                //http
                val url: URL
                url= URL("https://files.minsa.gob.pe/s/eRqxR35ZCxrzNgr/download")
                val urlconnection: HttpURLConnection
                urlconnection= url.openConnection() as HttpURLConnection
                val content:InputStream
                try {
                    content= urlconnection.getContent() as InputStream
                }finally {
                    urlconnection.disconnect()
                }
                ////////////////
                val service=retrofit.create(CovidService::class.java)

                instance= NetworkingManager(service)
            }
            return instance!!
        }
    }
}

