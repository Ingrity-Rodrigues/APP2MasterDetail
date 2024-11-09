package com.example.app2masterdetail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imagem = findViewById<ImageView>(R.id.imagemlivro)
        val nomeLivo = findViewById<TextView>(R.id.livro)
        val autora = findViewById<TextView>(R.id.autora)
        val ano = findViewById<TextView>(R.id.ano)
        val sinopse = findViewById<TextView>(R.id.sinopse)

    // Receber os dados da Intentval

        val itemImagem = intent.getIntExtra("imagemLivro", -1)
        val itemNomeLivo = intent.getStringExtra("nomeLivro")
        val itemAutora = intent.getStringExtra("autora")
        val itemAno = intent.getStringExtra("anoLancamento")
        val itemSinopse = intent.getStringExtra("sinopse")

    // Exibir os dados na tela

        if (itemImagem != 0) {imagem.setImageResource(itemImagem)}
        nomeLivo.text = itemNomeLivo
        autora.text = itemAutora
        ano.text = itemAno
        sinopse.text = itemSinopse

    }
}