package com.devshiv.newsappmvvm.ui.repository

import com.devshiv.newsappmvvm.data.api.ApiService
import com.devshiv.newsappmvvm.data.datasource.NewsDataSource
import com.devshiv.newsappmvvm.data.entity.NewsResponse
import com.devshiv.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
)  {

    suspend fun getNewsHeadline(country:String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getNewsHeadline(country)

            if (response.isSuccessful && response.body()!=null){
                emit(ResourceState.Success(response.body()!!))
            }else{
                emit(ResourceState.Error(response.errorBody()!!))
            }
        }.catch {e->
            emit(ResourceState.Error(e.localizedMessage ?: "Error In Flow!"))
        }
    }
}