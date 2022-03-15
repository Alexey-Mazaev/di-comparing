package com.example.di_comparing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feed.FeedFragment
import com.example.onboarding.login.LoginFragment
import com.example.share.ui.Navigator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLogin()
    }

    override fun showLogin() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.rootFrame, LoginFragment(), "login")
            .commitNow()
    }

    override fun showFeed() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.rootFrame, FeedFragment(), "feed")
            .commit()
    }
}