package com.devshiv.newsappmvvm.data.datasource

import com.devshiv.newsappmvvm.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadline(country :String): Response<NewsResponse>
}