package com.example.composegithubclient.model.repository

import com.example.composegithubclient.model.remote_data_source.GithubUser
import com.example.composegithubclient.model.remote_data_source.RemoteDataSource
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSource) : UserRepository {
    override suspend fun getUser(userName: String): User {
        return remoteDataSource.getGithubUser(userName).toUser()
    }

    private fun GithubUser.toUser() : User {
        return User(
            userId = UserId(value = id), name = name,
            avatarImage = NetworkImage(Url(avatarUrl)),
            blogUrl = Url(blog)
        )
    }
}