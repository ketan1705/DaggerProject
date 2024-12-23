package com.ken.daggerproject

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {


    @Binds
    @ApplicationScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

}