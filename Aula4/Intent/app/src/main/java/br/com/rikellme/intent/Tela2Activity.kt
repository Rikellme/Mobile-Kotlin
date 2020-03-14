package br.com.rikellme.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)


        //Recuperando o dado da intent
        val nome = intent.getStringExtra("nome")


        //Apresentar o textView
        txvSaudacao.text = "Seja Bem Vindo $nome"


        btnSair.setOnClickListener {

            onBackPressed()
        }


    }
}
