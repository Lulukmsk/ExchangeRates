package luluk.example.exchangeRateApplication.di

import luluk.example.exchangeRateApplication.di.provider.ExchangeRateProvider

interface DaggerApplication {

    fun getApplicationProvider(): ExchangeRateProvider
}