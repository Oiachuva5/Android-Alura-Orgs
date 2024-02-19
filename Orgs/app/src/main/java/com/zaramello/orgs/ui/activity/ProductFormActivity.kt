package com.zaramello.orgs.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.zaramello.orgs.R
import com.zaramello.orgs.dao.ProductsDao
import com.zaramello.orgs.model.ProductModel
import java.math.BigDecimal

class ProductFormActivity : AppCompatActivity(R.layout.product_form_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_form_activity)
        configurationButtonSave()
    }


    private fun configurationButtonSave() {
        val saveButton = findViewById<Button>(R.id.product_form_activity_button)
        saveButton.setOnClickListener {
            val dao = ProductsDao()
            val createProduct = createProduct()
            dao.add(createProduct)
            finish()

        }
    }
        private fun createProduct(): ProductModel {
            val nameField = findViewById<EditText>(R.id.product_form_activity_name)
            val name = nameField.text.toString()

            val descriptionField = findViewById<EditText>(R.id.product_form_activity_description)
            val description = descriptionField.text.toString()

            val valueField = findViewById<EditText>(R.id.product_form_activity_value)
            val valueInText = valueField.text.toString()
            val value =
                if (valueInText.isBlank()) BigDecimal.ZERO else BigDecimal(valueInText)

            return ProductModel(
                name = name,
                description = description,
                value = value
            )

        }
    }

