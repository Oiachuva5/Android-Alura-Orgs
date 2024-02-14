package com.zaramello.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.zaramello.orgs.R
import com.zaramello.orgs.model.ProductModel
import com.zaramello.orgs.ui.recyclerView.adapter.ProductListAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductListAdapter(context = this, products = listOf(
            ProductModel(nome = "teste",
                descricao = "teste",
                valor = BigDecimal("19.99")
            ),
            ProductModel(nome = "testeee",
                descricao = "teste",
                valor = BigDecimal("12.99")
            ),
            ProductModel(nome = "teste12",
                descricao = "teste",
                valor = BigDecimal("22.99")
            ),
        ))
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}