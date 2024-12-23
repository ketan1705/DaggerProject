package com.ken.daggerproject

import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [UserRepositoryModule::class, NotificationServiceModule::class]
)
// @Component(
//    dependencies = [AppComponent::class],
//    modules = [UserRepositoryModule::class, NotificationServiceModule::class]
//)
interface UserRegistrationComponent {
//    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService(): EmailService


    fun inject(mainActivity: MainActivity)

    // component
    /*      @Component.Factory
      interface Factory {
          fun create(
              @BindsInstance retryCount: Int,
              appComponent: AppComponent
          ): UserRegistrationComponent
      }
  */

    // using subcomponent

  /*  @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance retryCount: Int
        ): UserRegistrationComponent
    }*/


    // Builder patter use

    @Subcomponent.Builder
    interface Builder {
        // this build function is necessary when we use Builder
        fun build(): UserRegistrationComponent

        fun retryCount(@BindsInstance retryCount: Int): Builder
    }


}