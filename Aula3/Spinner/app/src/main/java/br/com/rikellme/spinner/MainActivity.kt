package br.com.rikellme.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando a Lista de Frutas

        var listaTeste = arrayListOf("Rikellme", 31)

        var listaFrutas = arrayListOf<String>()

        listaFrutas.add("Laranja")
        listaFrutas.add("Morango")
        listaFrutas.add("Pitomba")
        listaFrutas.add("Jambo")
        listaFrutas.add("Acerola")


        //Criando um Adaptador

        val frutasAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item,
            listaFrutas)

        spnFrutas.adapter = frutasAdapter



         }
    }