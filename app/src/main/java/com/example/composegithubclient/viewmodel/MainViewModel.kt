package com.example.composegithubclient.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.composegithubclient.model.repository.User
import com.example.composegithubclient.model.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {
    /**
     * Viewの状態を表すUiState
     */
    sealed class UiState {
        /** 初期状態 */
        object Initial : UiState()
        /** 読み込み中 */
        object Loading : UiState()
        /** 読み込み成功 */
        data class Success(val user : User) : UiState()
        /** 読み込み失敗 */
        object Failure : UiState()
    }

    val uiState : MutableState<UiState> = mutableStateOf(UiState.Initial)
}