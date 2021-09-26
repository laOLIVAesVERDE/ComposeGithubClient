package com.example.composegithubclient.model.remote_data_source

import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiClient: ApiClient) : RemoteDataSource {
    override suspend fun getGithubUser(userName: String): GithubUser {
        val response = apiClient.getGithubUser(userName)
        if (response.isSuccessful) return requireNotNull(response.body())
        throw HttpException()
    }
}

class HttpException : Throwable()