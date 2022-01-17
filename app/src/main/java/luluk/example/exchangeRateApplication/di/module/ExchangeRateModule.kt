package luluk.example.exchangeRateApplication.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import luluk.example.exchangeRateApplication.di.DaggerApplication
import javax.inject.Singleton

@Module
class ExchangeRateModule {

    @Singleton
    @Provides
    fun provideApplicationContext(application: DaggerApplication): Context {
        return application.getApplicationContext()
    }

}