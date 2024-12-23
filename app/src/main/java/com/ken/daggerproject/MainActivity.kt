package com.ken.daggerproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component =
//            DaggerUserRegistrationComponent.factory().create(3)
//                .notificationServiceModule(NotificationServiceModule(3))
//                .build()


        val component = (application as UserApplication).userRegistrationComponent

        component.inject(this@MainActivity)
        userRegistrationService.registerUser(
            "test@gmail.com", "test@123"
        )

    }
}