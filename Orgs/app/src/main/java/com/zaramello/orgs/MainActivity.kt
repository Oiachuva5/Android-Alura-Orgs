package com.zaramello.orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_SHORT).show()
        val view = TextView(this)
        view.setText("oi")
        setContentView(view)
    }
}