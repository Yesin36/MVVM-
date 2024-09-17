package com.gogote.shayari

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context


@Database(entities = [DataEntity::class], version = 1, exportSchema = true)

@TypeConverters(DateConverter::class)
abstract class ShayariDatabase: RoomDatabase() {

    abstract fun getShayariDao(): ShayariDao

    private var Instance: ShayariDatabase? = null

    fun getDatabase(context: Context): ShayariDatabase {
        if (Instance == null) {
            synchronized(this) {
                Instance = Room.databaseBuilder(
                    context.applicationContext,
                    ShayariDatabase::class.java,
                    "shayari_database"
                ).build()
            }
        }
        return Instance!!
    }

}