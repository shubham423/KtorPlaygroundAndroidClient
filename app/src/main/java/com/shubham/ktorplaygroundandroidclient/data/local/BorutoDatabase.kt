package com.shubham.ktorplaygroundandroidclient.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.shubham.ktorplaygroundandroidclient.data.local.dao.HeroDao
import com.shubham.ktorplaygroundandroidclient.data.local.dao.HeroRemoteKeyDao
import com.shubham.ktorplaygroundandroidclient.domain.model.Hero
import com.shubham.ktorplaygroundandroidclient.domain.model.HeroRemoteKey


@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}