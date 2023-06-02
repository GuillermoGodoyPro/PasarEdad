package com.matesdev.pasaredad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edage = findViewById<EditText>(R.id.idAge)
        var btEnviar = findViewById<Button>(R.id.btSendAge)

        btEnviar.setOnClickListener {
            var number:Int = edage.text.toString().toInt()
            if(number >= 21){
                val enviarEdad = Intent( this, ShowAge::class.java).apply {
                    putExtra("edad", number)
                }
                startActivity(enviarEdad)
            }else{
                Toast.makeText(this, "no se puede mostrar edad", Toast.LENGTH_LONG).show()
            }
        }

    }
}