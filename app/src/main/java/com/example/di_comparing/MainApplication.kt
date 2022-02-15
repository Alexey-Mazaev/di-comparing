package com.example.di_comparing

import android.app.Application
import com.example.feed.FeedComponent
import com.example.feed.FeedComponentProvider
import com.example.onboarding.OnboardingComponent
import com.example.onboarding.OnboardingComponentProvider

class MainApplication : Application(), OnboardingComponentProvider, FeedComponentProvider {

    val appComponent: AppComponent = DaggerAppComponent.create()

    override fun provideFeedComponent(): FeedComponent = appComponent.feedComponent().build()

    override fun provideOnboardingComponent(): OnboardingComponent = appComponent.onboardingComponent().build()
}