package com.ken.daggerproject

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
//    @Named("message") private val notificationService: NotificationService
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@example.com", "User Registered")
    }
}