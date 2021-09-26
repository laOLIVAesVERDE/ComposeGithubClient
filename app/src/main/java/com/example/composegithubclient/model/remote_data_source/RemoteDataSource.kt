package com.example.composegithubclient.model.remote_data_source

interface RemoteDataSource {
    suspend fun getGithubUser(userName : String) : GithubUser
}