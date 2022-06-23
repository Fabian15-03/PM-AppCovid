package pe.edu.ulima.pm.appcovid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import pe.edu.ulima.pm.appcovid.fragments.FragmentData

class MenuActivity : AppCompatActivity()  {
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
}