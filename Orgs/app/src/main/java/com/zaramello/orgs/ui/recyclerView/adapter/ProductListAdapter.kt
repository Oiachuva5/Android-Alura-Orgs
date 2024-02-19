package com.zaramello.orgs.ui.recyclerView.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zaramello.orgs.R
import com.zaramello.orgs.model.ProductModel

class ProductListAdapter(
    private val context: Context,
    products: List<ProductModel>
) : RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    private val products = products.toMutableList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(product: ProductModel) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = product.nome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = product.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = product.valor.toPlainString()

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.product_item, parent, false )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int = products.size

    fun update(products: List<ProductModel>) {
        this.products.clear()
        this.products.addAll(products)
        notifyDataSetChanged()
    }

}
