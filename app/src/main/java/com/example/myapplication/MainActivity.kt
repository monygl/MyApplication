package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Ciudad=intent.getStringExtra("com.example.myapplication.ciudades.CIUDAD")



        /* Toast.makeText(this,Ciudad,Toast.LENGTH_LONG).show()*/

        val Ciudadmx = Ciudad("Ciudad de México", 15, "Soleado")
        val CiudadBerlin = Ciudad("Ciudad Berlin", 30, "Cielo Despejado")

        if(Ciudad == "Ciudad_Mexico"){
            tvCiudad?.text=Ciudadmx.nombre
            tvGrados?.text=Ciudadmx.grados.toString() + "°"
            tvStatus?.text=Ciudadmx.status
        }else if (Ciudad == "Ciudad_Berlin"){
            tvCiudad?.text=CiudadBerlin.nombre
            tvGrados?.text=CiudadBerlin.grados.toString() + "°"
            tvStatus?.text=CiudadBerlin.status
        }else{
            Toast.makeText(this,"No se encuentra la información", Toast.LENGTH_LONG).show()
        }

    }


}
