package com.ken.daggerproject

import android.util.Log
import com.ken.daggerproject.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Save In DB $email , $password")
    }
}