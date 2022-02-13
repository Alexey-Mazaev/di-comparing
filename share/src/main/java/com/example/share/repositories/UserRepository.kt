package com.example.share.repositories

import com.example.share.entities.User

interface UserRepository {

    val currentUser: User?

    fun login(login: String, password: String): User?
}