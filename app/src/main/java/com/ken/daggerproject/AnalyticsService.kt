package com.ken.daggerproject

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)

}

class MixPanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(Constants.TAG, "MixPanel: $eventName, $eventType")
    }
}

class FireBaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(Constants.TAG, "FirebaseAnalytics: $eventName, $eventType")
    }
}