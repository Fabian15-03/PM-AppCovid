package pe.edu.ulima.pm.appcovid.networking

import java.net.HttpURLConnection
import java.net.URL

class NetworkingManager(val service : CovidService) {
    companion object {
        private var instance: NetworkingManager? = null

        fun getInstance(): String {
            var text:String=""
            if (instance == null) {

                val url: URL
                url= URL("http:.com")
                val urlconnection: HttpURLConnection
                urlconnection= url.openConnection() as HttpURLConnection
                try {
                    text=urlconnection.inputStream.use { it.reader().use { reader->reader.readText() } }
                }finally {
                    urlconnection.disconnect()
                }
            }
            return text
        }
    }
}