package com.example.feed

import androidx.lifecycle.ViewModel
import com.example.share.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FeedModule {
    @Binds
    @IntoMap
    @ViewModelKey(FeedViewModel::class)
    abstract fun feedViewModel(viewModel: FeedViewModel): ViewModel
}