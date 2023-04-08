package com.elmaravilla.lumos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    private lateinit var btnDark:Button
    private lateinit var btnLight:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDark = findViewById(R.id.btnDark)
        btnLight = findViewById(R.id.btnLight)
        btnDark.setOnClickListener {
            Lumos().setDarkON(this) // Turn On Dark Mode.
        }
        btnLight.setOnClickListener {
            Lumos().setDarkOFF(this) // Turn Off Dark Mode.
        }

        Lumos().setDarkSchedule(this , 9 , 12) //Turn on Dark mode from 9 am to 12 pm.
    }
}