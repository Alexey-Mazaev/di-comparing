package com.example.share.di

import com.example.share.repositories.UserRepository
import com.example.share.repositories.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ShareModule {
    @Provides
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()
}