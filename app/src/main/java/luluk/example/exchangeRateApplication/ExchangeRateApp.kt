package luluk.example.exchangeRateApplication

import android.app.Application
import luluk.example.exchangeRateApplication.di.DaggerApplication
import luluk.example.exchangeRateApplication.di.component.ExchangeRateComponent
import luluk.example.exchangeRateApplication.di.provider.ExchangeRateProvider

class ExchangeRateApp :Application(), DaggerApplication {

    lateinit var appComponent: ExchangeRateComponent

    override fun onCreate() {
        super.onCreate()

        buildDi()
    }

    private fun buildDi(){
        appComponent = ExchangeRateComponent.Builder.build(this)
    }

    override fun getApplicationProvider(): ExchangeRateProvider {
        return appComponent
    }
}