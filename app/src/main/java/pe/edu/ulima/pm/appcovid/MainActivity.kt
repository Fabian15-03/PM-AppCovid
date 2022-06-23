package pe.edu.ulima.pm.appcovid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import pe.edu.ulima.pm.appcovid.R.*
import pe.edu.ulima.pm.appcovid.fragments.FragmentData

class MainActivity : FragmentActivity() {
    private val fragmentData = FragmentData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_data)
    }
    private fun mostrarFragmentSobreNosotros(ft: FragmentTransaction) {
        ft.replace(id.secciones,fragmentData)
    }
}