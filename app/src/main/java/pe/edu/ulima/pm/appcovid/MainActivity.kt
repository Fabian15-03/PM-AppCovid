package pe.edu.ulima.pm.appcovid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import pe.edu.ulima.pm.appcovid.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
    private fun mostrarFragmentSobreNosotros(ft: FragmentTransaction) {
        ft.replace(id.secciones,fragmentSobreNosotros)
    }
}