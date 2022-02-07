package com.example.share.repositories

import com.example.share.entities.User

interface UserRepository {

    fun login(login: String, password: String): User
}