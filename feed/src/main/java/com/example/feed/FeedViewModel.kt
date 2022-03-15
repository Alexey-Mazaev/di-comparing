package com.example.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.share.entities.User
import com.example.share.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    userRepository: UserRepository
): ViewModel() {

    private val _currentUser: MutableLiveData<User> = MutableLiveData()
    val currentUser: LiveData<User> = _currentUser

    init {
        _currentUser.value = userRepository.getCurrentUser()
    }
}