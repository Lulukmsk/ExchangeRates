package luluk.example.exchangeRateApplication.di.component

import dagger.BindsInstance
import dagger.Component
import luluk.example.exchangeRateApplication.ExchangeRateMainActivity
import luluk.example.exchangeRateApplication.di.DaggerApplication
import luluk.example.exchangeRateApplication.di.module.AssistedInjectModule
import luluk.example.exchangeRateApplication.di.module.ExchangeRateModule
import luluk.example.exchangeRateApplication.ui.current.CurrentExchangeFragment
import luluk.example.exchangeRateApplication.ui.exchange.ExchangeTabFragment
import luluk.example.exchangeRateApplication.ui.favourite.FavouriteExchangeFragment
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ExchangeRateModule::class,
        AssistedInjectModule::class
    ]
)
interface ExchangeRateComponent {

    fun inject(target: ExchangeRateMainActivity)
    fun inject(target: ExchangeTabFragment)
    fun inject(target: CurrentExchangeFragment)
    fun inject(target: FavouriteExchangeFragment)

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

            fun build(app: DaggerApplication): ExchangeRateComponent {
                if (component == null) {
                    component = DaggerExchangeRateComponent.builder()
                        .application(app)
                        .build()
                }

                return component!!
            }
        }
    }
}