package com.example.share.repositories

import com.example.share.entities.User

internal class UserRepositoryImpl: UserRepository {

    private var _currentUser: User? = null

    override val currentUser: User? = _currentUser


    override fun login(login: String, password: String): User? {
        _currentUser = User(login, password)
        return currentUser
    }
}