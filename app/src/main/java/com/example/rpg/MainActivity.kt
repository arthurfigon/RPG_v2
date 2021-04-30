package com.example.rpg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val JOGADOR_NOME = "com.example.rpg.JOGADOR_NOME"
const val JOGADOR_CLASSE = "com.example.rpg.JOGADOR_CLASSE"
const val JOGADOR_RACA = "com.example.rpg.JOGADOR_RACA"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCriarJogador: Button = findViewById(R.id.btn_criarJogador)
        val btnCriarMestre: Button = findViewById(R.id.btn_criarMestre)
        val btnCriarMonstro: Button = findViewById(R.id.btn_criarMonstro)
        val btnCriarItem: Button = findViewById(R.id.btn_criarItem)
        val btnCriarLugar: Button = findViewById(R.id.btn_criarLugar)
        val txvTitulo: TextView = findViewById(R.id.txv_tituloApp)

        btnCriarJogador.setOnClickListener { createPlayer() }
        val nomeJogador = intent.getStringExtra(JOGADOR_NOME)
        val classeJogador = intent.getStringExtra(JOGADOR_CLASSE)
        val racaJogador = intent.getStringExtra(JOGADOR_RACA)
        if(nomeJogador!=null)
                txvTitulo.text = nomeJogador + ", " + classeJogador + ", " + racaJogador + "!"

    }

    fun createPlayer(){
        val intent = Intent(this, CriarJogadorActivity::class.java)
        startActivity(intent)
    }
}