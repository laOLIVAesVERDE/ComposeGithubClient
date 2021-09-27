package com.example.composegithubclient.model.repository

interface UserRepository {
    suspend fun getUser(userName : String) : User
}