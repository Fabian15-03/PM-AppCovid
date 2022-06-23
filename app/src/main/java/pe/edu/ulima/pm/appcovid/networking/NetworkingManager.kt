package pe.edu.ulima.pm.appcovid.networking

import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class NetworkingManager() {
    companion object {
        private var instance: NetworkingManager? = null

        fun getInstance(): String {
            var text:String=""
            if (instance == null) {

                val url: URL
                url= URL("https://files.minsa.gob.pe/s/eRqxR35ZCxrzNgr/download")
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

