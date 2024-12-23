package com.ken.daggerproject

import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
//    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService(): EmailService


    fun inject(mainActivity: MainActivity)
//    fun emailService(): EmailService

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }


}