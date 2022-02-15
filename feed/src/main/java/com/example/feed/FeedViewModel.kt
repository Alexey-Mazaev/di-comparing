package com.example.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.share.entities.User
import com.example.share.repositories.UserRepository
import javax.inject.Inject

class FeedViewModel @Inject constructor (
    private val userRepository: UserRepository
): ViewModel() {

    private val _currentUser: MutableLiveData<User> = MutableLiveData()
    val currentUser: LiveData<User> = _currentUser

    init {
        _currentUser.value = userRepository.getCurrentUser()
    }
}