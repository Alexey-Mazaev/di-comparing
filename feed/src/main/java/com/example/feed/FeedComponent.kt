package com.example.feed

import dagger.Subcomponent

@Subcomponent
interface FeedComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeedComponent
    }

    fun inject(fragment: FeedFragment)
}