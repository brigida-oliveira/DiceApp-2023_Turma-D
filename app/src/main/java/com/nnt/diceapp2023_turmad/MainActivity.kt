package com.nnt.diceapp2023_turmad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textoView)
        val botao = findViewById<Button>(R.id.botao)
        val grupoDeDados = findViewById<ChipGroup>(R.id.chipGroup)
        val imagem = findViewById<ImageView>(R.id.imageView)

        botao.setOnClickListener {lancarDado(texto, grupoDeDados, imagem)}
    }

    private fun lancarDado(texto: TextView, grupoDeDados: ChipGroup, imagem: ImageView) {
        val faceSorteada: Int
        when(grupoDeDados.checkedChipId) {
            R.id.d4 -> {
               faceSorteada = (1..4).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d4_1)
                    2 -> imagem.setImageResource(R.drawable.d4_2)
                    3 -> imagem.setImageResource(R.drawable.d4_3)
                    4 -> imagem.setImageResource(R.drawable.d4_4)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d6 -> {
                faceSorteada = (1..6).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d6_1)
                    2 -> imagem.setImageResource(R.drawable.d6_2)
                    3 -> imagem.setImageResource(R.drawable.d6_3)
                    4 -> imagem.setImageResource(R.drawable.d6_4)
                    5 -> imagem.setImageResource(R.drawable.d6_5)
                    6 -> imagem.setImageResource(R.drawable.d6_6)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d8 -> {
                faceSorteada = (1..8).random()
                when(faceSorteada) {
                    1 -> imagem.setImageResource(R.drawable.d8_1)
                    2 -> imagem.setImageResource(R.drawable.d8_2)
                    3 -> imagem.setImageResource(R.drawable.d8_3)
                    4 -> imagem.setImageResource(R.drawable.d8_4)
                    5 -> imagem.setImageResource(R.drawable.d8_5)
                    6 -> imagem.setImageResource(R.drawable.d8_6)
                    7 -> imagem.setImageResource(R.drawable.d8_7)
                    8 -> imagem.setImageResource(R.drawable.d8_8)
                }
                texto.text = faceSorteada.toString()
            }
            R.id.d10 -> texto.text = (1..10).random().toString()
            R.id.d12 -> texto.text = (1..12).random().toString()
            R.id.d20 -> texto.text = (1..20).random().toString()
        }
    }

}