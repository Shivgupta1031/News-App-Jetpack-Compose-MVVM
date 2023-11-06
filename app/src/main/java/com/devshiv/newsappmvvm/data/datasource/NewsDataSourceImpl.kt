package com.devshiv.newsappmvvm.data.datasource

import com.devshiv.newsappmvvm.data.api.ApiService
import com.devshiv.newsappmvvm.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }
}