package com.example.di_comparing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onboarding.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.rootFrame, LoginFragment(), "login")
            .commitNow()
    }
}