package com.zaramello.orgs.dao

import com.zaramello.orgs.model.ProductModel

class ProductsDao {
    fun add(product: ProductModel){
        products.add(product)
    }
    fun findAll(): List<ProductModel>{
        return products.toList()
    }

    companion object{
        private val products = mutableListOf<ProductModel>()
    }
}