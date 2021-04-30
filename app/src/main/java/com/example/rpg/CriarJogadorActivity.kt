package com.example.rpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CriarJogadorActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogador_creation)

        val btnCriarJogador: Button = findViewById(R.id.btn_confirmUser)
        val edtNomeJogador: EditText = findViewById(R.id.edt_UsernameCreation)
        val edtClasseJogador: EditText = findViewById(R.id.edt_UserClass)
        val edtRacaJogador: EditText = findViewById(R.id.edt_UserRace)

        var nameJogador: String
        var classeJogador: String
        var racaJogador: String

        btnCriarJogador.setOnClickListener {
            nameJogador = edtNomeJogador.text.toString()
            classeJogador = edtClasseJogador.text.toString()
            racaJogador = edtRacaJogador.text.toString()
            createPlayer(nameJogador,classeJogador,racaJogador)
        }
    }

    fun createPlayer(nome: String, classe: String, raça: String){
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(JOGADOR_NOME, nome)
            putExtra(JOGADOR_CLASSE, classe)
            putExtra(JOGADOR_RACA, raça)
        }
        startActivity(intent)
    }
}