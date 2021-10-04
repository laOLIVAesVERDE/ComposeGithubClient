package com.example.composegithubclient.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.composegithubclient.model.repository.User
import com.example.composegithubclient.viewmodel.MainViewModel
import java.lang.IllegalStateException

@Composable
fun MainView(mainViewModel: MainViewModel) {
    val uiState : MainViewModel.UiState by mainViewModel.uiState

    Column(Modifier.fillMaxWidth()) {
        SearchView(
            searchQuery = mainViewModel.searchQuery,
            onSearchButtonTapped = mainViewModel::onSearchTapped
        )
        // stateによって切り替える
        when (uiState) {
            is MainViewModel.UiState.Initial -> InitialView()
            is MainViewModel.UiState.Loading -> LoadingView()
            is MainViewModel.UiState.Success -> UserDetailView(user = uiState.requireUser())
            is MainViewModel.UiState.Failure -> ErrorView()
        }
    }
}

private fun MainViewModel.UiState.requireUser() : User {
    if (this !is MainViewModel.UiState.Success) throw IllegalStateException("user is not loaded.")
    return user
}