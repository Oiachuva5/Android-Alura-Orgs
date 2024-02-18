package com.zaramello.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.zaramello.orgs.R
import com.zaramello.orgs.model.ProductModel
import java.math.BigDecimal

class ProductFormActivity : AppCompatActivity(R.layout.product_form_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_form_activity)

        val saveButton = findViewById<Button>(R.id.buttonForm)
        saveButton.setOnClickListener {

            val campoNome = findViewById<EditText>(R.id.nomeItem)
            val nome = campoNome.text.toString()

            val campoDescricao = findViewById<EditText>(R.id.descricaoItem)
            val descricao = campoDescricao.text.toString()

            val campoValor = findViewById<EditText>(R.id.valorItem)
            val valorEmTexto = campoValor.text.toString()
            val valor =
                if(valorEmTexto.isBlank()) BigDecimal.ZERO else BigDecimal(valorEmTexto)

            val newProduct = ProductModel(
                nome = nome,
                descricao = descricao,
                valor = valor
            )


            Log.i("ProductForm", "onCreate: $newProduct")
        }
    }
}
