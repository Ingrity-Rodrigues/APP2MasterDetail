package com.example.app2masterdetail.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app2masterdetail.DetailActivity
import com.example.app2masterdetail.R
import com.example.app2masterdetail.model.Book

class AdapterBook( private val books: MutableList<Book>): RecyclerView.Adapter<AdapterBook.BookViewHolder>() {

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imageLivro = itemView.findViewById<ImageView>(R.id.imageLivro)
        val nomeLivro = itemView.findViewById<TextView>(R.id.nomeLivro)
        val nomeAutora = itemView.findViewById<TextView>(R.id.nomeAutora)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {

        val itemLista = LayoutInflater.from(parent.context).inflate(R.layout.hp_book,parent,false)
        val holder = BookViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {

        val currentItem = books[position]

        holder.imageLivro.setImageResource(books[position].imagemLivro)
        holder.nomeLivro.text = books[position].nomeLivro
        holder.nomeAutora.text = books[position].autora

        holder.itemView.setOnClickListener {

            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)

        // Passando os dados para a nova Activity

            intent.putExtra("imagemLivro", currentItem.imagemLivro)
            intent.putExtra("nomeLivro", currentItem.nomeLivro)
            intent.putExtra("autora", currentItem.autora)
            intent.putExtra("anoLancamento", currentItem.anoLancamento)
            intent.putExtra("sinopse", currentItem.sinopse)
            context.startActivity(intent)
        }
    }
}