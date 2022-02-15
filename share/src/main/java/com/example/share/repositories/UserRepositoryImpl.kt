package com.example.share.repositories

import com.example.share.entities.User
import javax.inject.Singleton

@Singleton
internal class UserRepositoryImpl: UserRepository {

    private var _currentUser: User? = null

    override fun getCurrentUser(): User? = _currentUser


    override fun login(login: String, password: String): User? {
        _currentUser = User(login, password)
        return _currentUser
    }
}