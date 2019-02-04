package com.example.mikaelpetersvanasbakken.kalkulatorver2

import kotlinx.android.synthetic.main.activity_main.*
import android.bluetooth.le.AdvertiseData
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
var valueOne: Int = 0
var valueTwo: Int = 0
private var NumCalc: MutableList<Int> = ArrayList()


class MainActivity : AppCompatActivity() {
    // Brukt for å vise input og output

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Oppretter variabler og assigner knapper til dem.
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val btnMultiply: Button = findViewById(R.id.btnMultiply)
        val btnDivide: Button = findViewById(R.id.btnDivide)

     // gjør slik at knappene kan nåes
        var input_a = inputa.text
        var input_b = inputb.text

        //Måten vi kalkulerer ting de forskjellige knappene på.
        // Gjør om inputa.text til en string, deretter til en long og plusser det med verdi 2
        // Resultatet blir vist i en toast
        btnPlus.setOnClickListener{
        var result = input_a.toString()?.toLong() + input_b.toString()?.toLong()
            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
        }
        btnMinus.setOnClickListener{
            var result = input_a.toString()?.toLong() - input_b.toString()?.toLong()
            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
        }
        btnMultiply.setOnClickListener {
            var result = input_a.toString()?.toLong() * input_b.toString()?.toLong()
            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
        }
        btnDivide.setOnClickListener {
            var result = input_a.toString()?.toLong() / input_b.toString()?.toLong()
            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
        }


        }

    }



