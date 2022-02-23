package mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDarAlta.setOnClickListener(){
           DarAlta()
        }

        btnAcercaDe.setOnClickListener(){
            AcercaDe()
        }

        btnSalir.setOnClickListener(){
            finish()
        }
    }

    //METODOS

    fun DarAlta(){
       val ventana = Intent(this,MainActivity2::class.java)
      startActivity(ventana)
     }

    fun AcercaDe() {
        val ventana = Intent(this,ScrollingActivity::class.java)
        startActivity(ventana)
    }

}