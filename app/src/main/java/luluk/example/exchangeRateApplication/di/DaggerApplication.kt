package luluk.example.exchangeRateApplication.di

import android.content.Context
import luluk.example.exchangeRateApplication.di.provider.ExchangeRateProvider

interface DaggerApplication {

    fun getApplicationContext(): Context

    fun getApplicationProvider(): ExchangeRateProvider
}