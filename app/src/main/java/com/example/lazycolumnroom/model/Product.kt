package com.example.lazycolumnroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_product")
data class Product(
    @PrimaryKey(autoGenerate = true)
        var id: Long = 0,
    @ColumnInfo(name = "product_name")
        var productName: String = "Prodcut Name",
    @ColumnInfo(name = "product_description")
        var productDescription: String = "Description of the Product",
    @ColumnInfo(name = "product_price")
        var productPrice:Double = 0.0


)
