package com.ken.daggerproject

import dagger.Component

@ApplicationScope
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
//    fun getAnalyticsService(): AnalyticsService

//    fun getUserRegistrationComponentFactory(): UserRegistrationComponent.Factory

    fun getUserRegistrationComponentBuilder(): UserRegistrationComponent.Builder
}