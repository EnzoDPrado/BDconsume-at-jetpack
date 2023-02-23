package com.example.lazycolumnroom.dao.repository

import android.content.Context
import com.example.lazycolumnroom.dao.ProductDb
import com.example.lazycolumnroom.model.Product

class ProductRepository(context: Context) {

    private val db = ProductDb.getDataBase(context).productDao()
        fun getProductsList():List<Product> {
            return db.getAll()
        }

    fun save(product: Product): Int {
        return db.save(product).toInt()
    }
}