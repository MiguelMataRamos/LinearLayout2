package com.example.linearlayout2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ciervo = findViewById<Button>(R.id.jagger)
        var contj = 1
        ciervo.setOnClickListener{
            contj ++
            if (contj % 2 == 0) {
                ciervo.text = "AMNESIA"
            }
        }


        val choriso = findViewById<Button>(R.id.bocata)
        var contc = 1
        choriso.setOnClickListener{
            contc ++
            if (contj % 2 == 0){
                choriso.text = "CON UN POCO PAN"
            }
        }


        val ener = findViewById<Button>(R.id.eneryeti)
        var conte = 1
        ener.setOnClickListener{
            conte ++
            if (conte % 2 == 0){
                ener.text = "CON UN POCO PAN"
            }
        }



    }
}