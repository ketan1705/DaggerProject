package com.ken.daggerproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationComponent = DaggerUserRegistrationComponent.builder()
            .build().getUserRegistrationService()
        userRegistrationComponent.registerUser("test@gmail.com", "test@123")

    }
}