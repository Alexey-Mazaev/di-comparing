package com.example.onboarding.login

import androidx.lifecycle.ViewModel
import com.example.share.repositories.UserRepository

class LoginViewModel(
    private val userRepository: UserRepository,
): ViewModel() {

    fun login(userName: String, password: String) {
        userRepository.login(userName, password)
    }

}