package com.zaramello.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.zaramello.orgs.R
import com.zaramello.orgs.dao.ProductsDao
import com.zaramello.orgs.ui.recyclerView.adapter.ProductListAdapter

class ProductListActivity : AppCompatActivity(R.layout.activity_product_list) {
    private val dao = ProductsDao()
    private val adapter = ProductListAdapter(context = this, products = dao.findAll())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerViewConfiguration()
        floatingActionButtonConfiguration()
    }

    override fun onResume() {
        super.onResume()
        adapter.update(dao.findAll())
    }

    private fun floatingActionButtonConfiguration() {
        val floatingActionButton = findViewById<FloatingActionButton>(R.id.product_list_activity_floatingActionButton)
        floatingActionButton.setOnClickListener {
            goToForms()
        }
    }

    private fun recyclerViewConfiguration() {

        val recyclerView = findViewById<RecyclerView>(R.id.product_list_activity_recyclerView)
        recyclerView.adapter = adapter

    }

    private fun goToForms(){
        val intent = Intent(this, ProductFormActivity::class.java)
        startActivity(intent)
    }
}