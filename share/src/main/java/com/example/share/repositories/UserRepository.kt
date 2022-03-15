package com.example.share.repositories

import com.example.share.entities.User

interface UserRepository {

    fun getCurrentUser(): User?

    fun login(login: String, password: String): User?
}