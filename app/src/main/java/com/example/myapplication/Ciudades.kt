package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ciudades.*
import kotlinx.android.synthetic.main.*

class Ciudades : AppCompatActivity() {

    val TAG ="com.example.myapplication.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bMexico = bMexico
        val bBerlin = bBerlin

        bMexico.setOnClickListener(View.OnClickListener {

            val Intent = Intent(this, MainActivity::class.java)
            Intent.putExtra(TAG,"Ciudad_Mexico")
            startActivity(Intent)

        })

        bBerlin.setOnClickListener(View.OnClickListener {

            val Intent = Intent(this, MainActivity::class.java)
            Intent.putExtra(TAG,"Ciudad_Berlin")
            startActivity(Intent)
        })
    }
}
