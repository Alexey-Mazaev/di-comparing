package com.example.onboarding

import com.example.onboarding.login.LoginFragment
import dagger.Subcomponent

@Subcomponent
interface OnboardingComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): OnboardingComponent
    }

    fun inject(fragment: LoginFragment)
}