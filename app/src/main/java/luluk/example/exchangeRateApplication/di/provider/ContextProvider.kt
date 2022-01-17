package luluk.example.exchangeRateApplication.di.provider

import android.content.Context

interface ContextProvider {
    fun provideAppContext(): Context
}