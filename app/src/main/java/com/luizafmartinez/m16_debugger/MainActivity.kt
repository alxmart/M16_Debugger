package com.luizafmartinez.m16_debugger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textClique: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textClique = findViewById(R.id.textClique)

        textClique.setOnClickListener {
            val listaUsuarios = listOf("Jamilton", "Ana", "Maria", "João")
            exibirListaItens( listaUsuarios )
        }

    }
    private fun exibirListaItens(listaUsuarios: List<String>) {

        var exibirPrimeiroUsuario = true
        var contadorItens = 0 // Break Point

        for ( usuario in listaUsuarios ) {
            if (exibirPrimeiroUsuario) {
                println("Primeiro usuário:")
                exibirPrimeiroUsuario = false
            }

            exibirItem( usuario )
            contadorItens++
        }
    }

    private fun exibirItem(usuario: String) {
        println( usuario )
        println("------------")
    }
}
