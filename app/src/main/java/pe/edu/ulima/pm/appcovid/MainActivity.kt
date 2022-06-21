package pe.edu.ulima.pm.appcovid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import pe.edu.ulima.pm.appcovid.R.*
import pe.edu.ulima.pm.appcovid.fragments.FragmentData

class MainActivity : AppCompatActivity() {
    private val fragmentData = FragmentData()
    private var mbtData: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        mbtData=findViewById(R.id.btnData)
        mbtData!!.setOnClickListener{v: View ->
            //Camiando de view
            val intent: Intent = Intent()
            intent.setClass(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun mostrarFragmentSobreNosotros(ft: FragmentTransaction) {
        ft.replace(id.secciones,fragmentData)
    }
}