package com.ken.daggerproject

import android.util.Log
import com.ken.daggerproject.Constants.TAG
import javax.inject.Inject
import javax.inject.Singleton


interface NotificationService {
    fun send(to: String, from: String, body: String)
}

//@Singleton
@ApplicationScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG, "Email Sent $to , $from , $body")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG, "Message Sent $to, $from, $body , $retryCount")
    }
}