package com.matesdev.pasaredad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ShowAge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_age)

        var txMostrarEdad = findViewById<TextView>(R.id.txAgeUser)
        var btvolver = findViewById<Button>(R.id.btVolver)

        var Edad = intent.getIntExtra( "edad", 0)
        txMostrarEdad.text = "Edad: $Edad"

        btvolver.setOnClickListener {
            val intentMostrarEdad = Intent( this, MainActivity::class.java)
            startActivity(intentMostrarEdad)
        }
    }
}