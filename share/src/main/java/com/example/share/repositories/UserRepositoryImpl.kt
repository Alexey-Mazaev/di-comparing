package com.example.share.repositories

import com.example.share.entities.User

class UserRepositoryImpl: UserRepository {

    override fun login(login: String, password: String): User = User(login, password)

}