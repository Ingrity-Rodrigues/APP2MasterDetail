package com.example.app2masterdetail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app2masterdetail.adapter.AdapterBook
import com.example.app2masterdetail.model.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView_books = findViewById<RecyclerView>(R.id.hpBooksRV)
        recyclerView_books.layoutManager = LinearLayoutManager(this)
        recyclerView_books.setHasFixedSize(true)
        //adapter
        val listaBooks: MutableList<Book> = mutableListOf()
        val adapterBook = AdapterBook(listaBooks)
        recyclerView_books.adapter = adapterBook

        val book1 = Book(
            nomeLivro = "Harry Potter e a Pedra Filosofal",
            anoLancamento = "2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp1
        )
        listaBooks.add(book1)

        val book2 = Book(
            nomeLivro = "Harry Potter e a Câmara Secreta",
            anoLancamento ="2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp2
        )
        listaBooks.add(book2)

        val book3 = Book(
            nomeLivro = "Harry Potter e o Prisioneiro de Azkaban",
            anoLancamento = "2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp3
        )
        listaBooks.add(book3)

        val book4 = Book(
            nomeLivro = "Harry Potter e o Cálice de Fogo",
            anoLancamento = "2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp4
        )
        listaBooks.add(book4)

        val book5 = Book(
            nomeLivro = "Harry Potter e a Ordem da Fênix",
            anoLancamento = "2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp5
        )
        listaBooks.add(book5)

        val book6 = Book(
            nomeLivro = "Harry Potter e o Enigma do Príncipe",
            anoLancamento = "2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp6
        )
        listaBooks.add(book6)

        val book7 = Book(
            nomeLivro = "Harry Potter e as Relíquias da Morte",
            anoLancamento = "2000",
            autora = "J. K. Rowling",
            sinopse = "Vulputate phasellus turpis quisque bibendum nibh nec aliquam, facilisis himenaeos porta himenaeos porta inceptos, a etiam leo libero ultrices donec.",
            imagemLivro = R.drawable.hp7
        )
        listaBooks.add(book7)
    }
}