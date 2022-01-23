package luluk.example.exchangeRateApplication.viewmodel.current

import com.squareup.inject.assisted.AssistedInject
import luluk.example.exchangeRateApplication.viewmodel.base.BaseViewModel

open class CurrentExchangeViewModel @AssistedInject constructor() : BaseViewModel() {

    @AssistedInject.Factory
    interface Factory {
        fun get(): CurrentExchangeViewModel
    }
}