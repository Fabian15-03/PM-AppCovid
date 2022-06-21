package pe.edu.ulima.pm.appcovid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import pe.edu.ulima.pm.appcovid.R.*
import pe.edu.ulima.pm.appcovid.fragments.FragmentData

class MainActivity : AppCompatActivity() {
    private val fragmentData = FragmentData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
    private fun mostrarFragmentSobreNosotros(ft: FragmentTransaction) {
        ft.replace(id.secciones,fragmentData)
    }
}