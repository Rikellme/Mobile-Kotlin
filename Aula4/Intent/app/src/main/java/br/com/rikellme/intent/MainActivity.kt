package br.com.rikellme.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando a ação de clique do botão

        btnEnviar.setOnClickListener {

            //Capturando o texto digitado

            val nome = edtNome.text.toString().trim()

            if (nome.isNotEmpty()) {

                //Criando o objeto
                val intent = Intent(this, Tela2Activity::class.java)

                //Adicionando um dado no objeto intent
                intent.putExtra("nome", nome)
                intent.putExtra("idade", 16)



                //Executar a ação
                startActivity(intent)


            } else {

                //Apresentar mensagem para o usuário
                Toast.makeText(this@MainActivity, "Digite um nome", Toast.LENGTH_LONG)
                    .show()
            }

        }
    }
}
