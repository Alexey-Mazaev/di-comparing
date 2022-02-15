package com.example.di_comparing

import com.example.feed.FeedComponent
import com.example.onboarding.OnboardingComponent
import dagger.Module

@Module(subcomponents = [OnboardingComponent::class, FeedComponent::class])
class SubcomponentsModule