package com.zaramello.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.zaramello.orgs.R
import com.zaramello.orgs.dao.ProductsDao
import com.zaramello.orgs.model.ProductModel
import com.zaramello.orgs.ui.recyclerView.adapter.ProductListAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()

        val dao = ProductsDao()
        Log.i("MainActivity", "onCreate: ${dao.buscaTodos()}")
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductListAdapter(context = this, products = dao.buscaTodos())

        val floatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener{
            val intent = Intent(this, ProductFormActivity::class.java)
            startActivity(intent)
        }
    }
}