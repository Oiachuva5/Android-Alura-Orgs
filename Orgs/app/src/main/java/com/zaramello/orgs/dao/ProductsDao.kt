package com.zaramello.orgs.dao

import com.zaramello.orgs.model.ProductModel

class ProductsDao {
    fun adiciona(product: ProductModel){
        products.add(product)
    }
    fun buscaTodos(): List<ProductModel>{
        return products.toList()
    }

    companion object{
        private val products = mutableListOf<ProductModel>()
    }
}