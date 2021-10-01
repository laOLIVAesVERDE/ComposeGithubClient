package com.example.composegithubclient.model.repository

/**
 * repositoryを使う層にRemoteDataSourceを意識させない
 */
data class User(
    val userId: UserId,
    val name: String,
    val avatarImage: NetworkImage,
    val blogUrl: Url
)

data class UserId(val value : Long)
data class NetworkImage(val url : Url)
data class Url(val value : String)