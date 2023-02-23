package com.example.lazycolumnroom.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.lazycolumnroom.model.Product

@Database(entities = [Product::class], version = 1)
abstract class ProductDb: RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object{
        private lateinit var instance: ProductDb

        fun getDataBase(context: Context):ProductDb{
            //Verificar se a instanância já foi criada
            if(!::instance.isInitialized){
                instance = Room
                    .databaseBuilder(context, ProductDb::class.java, "db_product").allowMainThreadQueries().fallbackToDestructiveMigration().build()
            }
            return instance
        }
    }

}