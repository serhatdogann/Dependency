package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

interface Person {

    fun preparedProduct():String

}


@InstallIn(SingletonComponent::class)
@Module
class MyModule {

   @Singleton
   @CookerImplementor
   @Provides
   fun provideCooker(): Person {
      return Cooker()
   }

   @Singleton
   @BarmenImplementor
   @Provides
   fun provideBarmen(): Person {
      return Barmen()
   }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BarmenImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CookerImplementor

