package com.example.lazycolumnroom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.lazycolumnroom.model.Product

@Dao
interface ProductDao {

    @Insert
    fun save(product: Product): Long

    @Delete
    fun delete(product: Product): Int

    @Query("SELECT * FROM tbl_product ORDER BY product_name ASC")
    fun getAll(): List<Product>


}