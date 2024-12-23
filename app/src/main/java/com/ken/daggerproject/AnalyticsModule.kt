package com.ken.daggerproject

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @ApplicationScope
    @Provides
    fun provideAnalyticsService(): AnalyticsService {
        return FireBaseAnalytics()
    }
}