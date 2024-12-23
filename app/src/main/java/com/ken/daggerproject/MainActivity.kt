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

        val appComponent = (application as UserApplication).appComponent
        /*val userComponent =
            DaggerUserRegistrationComponent.factory()
                .create(3, appComponent)*/

        // when we use factory
        /*val userComponent =
            appComponent.getUserRegistrationComponentFactory()
                .create(3)
        */

        // when we use builder
        val userComponent =
            appComponent.getUserRegistrationComponentBuilder()
                .retryCount(3).build()

//                .notificationServiceModule(NotificationServiceModule(3))
//                .build()

//

        userComponent.inject(this@MainActivity)
        userRegistrationService.registerUser(
            "test@gmail.com", "test@123"
        )

    }
}