package com.example.composegithubclient.model.repository

import retrofit2.http.Url

data class User(
    val userId: UserId,
    val name: String,
    val avatarImage: NetworkImage,
    val blogUrl: com.example.composegithubclient.model.repository.Url
)

data class UserId(val value : Long)
data class NetworkImage(val url : Url)
data class Url(val value : String)
