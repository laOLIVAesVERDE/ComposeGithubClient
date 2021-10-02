package com.example.composegithubclient.viewmodel

import androidx.lifecycle.ViewModel
import com.example.composegithubclient.model.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

}