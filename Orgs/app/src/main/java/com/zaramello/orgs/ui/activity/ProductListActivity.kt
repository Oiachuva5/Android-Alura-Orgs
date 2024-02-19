package com.zaramello.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.zaramello.orgs.R
import com.zaramello.orgs.dao.ProductsDao
import com.zaramello.orgs.ui.recyclerView.adapter.ProductListAdapter

class ProductListActivity : AppCompatActivity(R.layout.activity_product_list) {
    private val dao = ProductsDao()
    private val adapter = ProductListAdapter(context = this, products = dao.buscaTodos())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerViewConfiguration()
        floatingActionButtonConfiguration()
    }

    override fun onResume() {
        super.onResume()
        adapter.update(dao.buscaTodos())
    }

    private fun floatingActionButtonConfiguration() {
        val floatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener {
            goToForms()
        }
    }

    private fun recyclerViewConfiguration() {

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter

    }

    private fun goToForms(){
        val intent = Intent(this, ProductFormActivity::class.java)
        startActivity(intent)
    }
}