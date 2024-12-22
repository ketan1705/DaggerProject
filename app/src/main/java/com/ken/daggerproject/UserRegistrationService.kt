package com.ken.daggerproject

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepositpry: UserRepository,
    private val emailService: EmailService
) {
    fun registerUser(email: String, password: String) {
        userRepositpry.saveUser(email, password)
        emailService.send(email, "no-reply@example.com", "User Registered")
    }
}