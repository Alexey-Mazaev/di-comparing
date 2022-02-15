package com.example.di_comparing

import com.example.feed.FeedComponent
import com.example.feed.FeedFragment
import com.example.feed.FeedModule
import com.example.onboarding.OnboardingComponent
import com.example.onboarding.login.LoginFragment
import com.example.onboarding.OnboardingModule
import com.example.share.ShareModule
import com.example.share.di.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        SubcomponentsModule::class,
        FeedModule::class,
        OnboardingModule::class,
        ShareModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {
    fun feedComponent(): FeedComponent.Builder

    fun onboardingComponent(): OnboardingComponent.Builder
}