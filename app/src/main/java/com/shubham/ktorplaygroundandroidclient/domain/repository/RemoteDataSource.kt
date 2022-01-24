package com.shubham.ktorplaygroundandroidclient.domain.repository

import androidx.paging.PagingData
import com.shubham.ktorplaygroundandroidclient.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(): Flow<PagingData<Hero>>
}