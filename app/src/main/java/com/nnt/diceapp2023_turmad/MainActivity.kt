package com.nnt.diceapp2023_turmad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textoView)
        val botao = findViewById<Button>(R.id.botao)
        val grupoDeDados = findViewById<ChipGroup>(R.id.chipGroup)

        botao.setOnClickListener {
            when(grupoDeDados.checkedChipId) {
                R.id.d4 -> texto.text = (1..4).random().toString()
                R.id.d6 -> texto.text = (1..6).random().toString()
                R.id.d8 -> texto.text = (1..8).random().toString()
                R.id.d10 -> texto.text = (1..10).random().toString()
                R.id.d12 -> texto.text = (1..12).random().toString()
                R.id.d20 -> texto.text = (1..20).random().toString()
            }

        }
    }
}