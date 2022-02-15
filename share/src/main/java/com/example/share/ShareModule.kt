package com.example.share

import com.example.share.repositories.UserRepository
import com.example.share.repositories.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ShareModule {

    @Singleton
    @Provides
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()
}