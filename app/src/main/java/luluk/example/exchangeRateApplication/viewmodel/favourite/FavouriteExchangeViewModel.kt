package luluk.example.exchangeRateApplication.viewmodel.favourite

import com.squareup.inject.assisted.AssistedInject
import luluk.example.exchangeRateApplication.viewmodel.base.BaseViewModel

open class FavouriteExchangeViewModel @AssistedInject constructor() : BaseViewModel() {

    @AssistedInject.Factory
    interface Factory {
        fun get(): FavouriteExchangeViewModel
    }
}