package com.example.onboarding

import androidx.lifecycle.ViewModel
import com.example.onboarding.login.LoginViewModel
import com.example.share.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class OnboardingModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun loginViewModel(viewModel: LoginViewModel): ViewModel
}