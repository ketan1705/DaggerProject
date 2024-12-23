package com.ken.daggerproject

import android.util.Log
import com.ken.daggerproject.Constants.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analytics: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Save In SQL $email , $password")
        analytics.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(val analytics: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Save In Firebase $email , $password")
        analytics.trackEvent("Save User", "CREATE")

    }
}