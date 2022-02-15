package com.example.onboarding.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.share.repositories.UserRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor (
    private val userRepository: UserRepository,
): ViewModel() {

    private val _loginSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val loginSuccess: LiveData<Boolean> = _loginSuccess

    fun login(userName: String, password: String) {
        val user = userRepository.login(userName, password)
        _loginSuccess.value = user != null
    }

}