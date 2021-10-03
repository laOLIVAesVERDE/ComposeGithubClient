package com.example.composegithubclient.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.example.composegithubclient.viewmodel.MainViewModel

@Composable
fun MainView(mainViewModel: MainViewModel) {
    val uiState : MainViewModel.UiState by mainViewModel.uiState
}