package com.ken.daggerproject

import android.util.Log
import com.ken.daggerproject.Constants.TAG
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(to: String, from: String, body: String) {
        Log.d(TAG, "Email Sent $to , $from , $body")
    }
}