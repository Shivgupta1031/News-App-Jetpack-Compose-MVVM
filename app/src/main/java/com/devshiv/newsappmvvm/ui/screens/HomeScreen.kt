package com.devshiv.newsappmvvm.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.devshiv.newsappmvvm.data.AppConstants.TAG
import com.devshiv.newsappmvvm.ui.components.EmptyListComponent
import com.devshiv.newsappmvvm.ui.components.Loader
import com.devshiv.newsappmvvm.ui.components.NewsRowComponent
import com.devshiv.newsappmvvm.ui.viewmodel.NewsViewModel
import com.devshiv.utilities.ResourceState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel()) {

    val newsResponse by newsViewModel.news.collectAsState()

    val pagerState = rememberPagerState(initialPage = 0, initialPageOffsetFraction = 0f)
    
    VerticalPager(state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp,
        pageCount = 10) {page->
        when (newsResponse) {
            is ResourceState.Loading -> {
                Log.d(TAG, "HomeScreen: Loading")
                Loader()
            }

            is ResourceState.Success -> {
                val response = (newsResponse as ResourceState.Success).data
                Log.d(TAG, "HomeScreen: Success ${response.status} ${response.totalResults}")

                if (response.articles.isNotEmpty()){
                NewsRowComponent(page, response.articles[page])}else{
                    EmptyListComponent()
                }
            }

            is ResourceState.Error -> {
                val response = (newsResponse as ResourceState.Error).error
                Log.d(TAG, "HomeScreen: Error $response")

            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
