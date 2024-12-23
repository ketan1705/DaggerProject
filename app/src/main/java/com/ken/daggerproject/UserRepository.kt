package com.ken.daggerproject

import android.util.Log
import com.ken.daggerproject.Constants.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Save In SQL $email , $password")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Save In Firebase $email , $password")
    }
}