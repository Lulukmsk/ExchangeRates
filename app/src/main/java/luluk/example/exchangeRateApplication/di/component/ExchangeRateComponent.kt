package luluk.example.exchangeRateApplication.di.component

import dagger.BindsInstance
import dagger.Component
import luluk.example.exchangeRateApplication.di.DaggerApplication
import luluk.example.exchangeRateApplication.di.module.AssistedInjectModule
import luluk.example.exchangeRateApplication.di.module.ExchangeRateModule
import luluk.example.exchangeRateApplication.di.provider.ExchangeRateProvider
import luluk.example.exchangeRateApplication.ui.exchange.ExchangeFragment
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ExchangeRateModule::class,
        AssistedInjectModule::class
    ]
)
interface ExchangeRateComponent : ExchangeRateProvider {

    fun inject(target: ExchangeFragment)

    @Component.Builder
    interface ComponentBuilder {

        @BindsInstance
        fun application(daggerApplication: DaggerApplication): ComponentBuilder

        fun build(): ExchangeRateComponent
    }

    class Builder private constructor() {
        companion object{
            var component: ExchangeRateComponent? = null
                private set

            fun build(daggerApplication: DaggerApplication): ExchangeRateComponent {
                if (component == null) {
                    component = DaggerExchangeRateComponent.builder()
                        .application(daggerApplication)
                        .build()
                }

                return component!!
            }
        }
    }
}