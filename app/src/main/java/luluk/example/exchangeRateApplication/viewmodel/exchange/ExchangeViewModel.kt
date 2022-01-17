package luluk.example.exchangeRateApplication.viewmodel.exchange

import com.squareup.inject.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import luluk.example.exchangeRateApplication.viewmodel.base.BaseViewModel

open class ExchangeViewModel @AssistedInject constructor() : BaseViewModel() {

    val uiState: StateFlow<BaseUiState>
        get() = MutableStateFlow(BaseUiState.StandBy(true))

    sealed class BaseUiState {
        data class StandBy(val initial: Boolean): BaseUiState()
        data class Error(val exception: Throwable): BaseUiState()
    }

    @AssistedInject.Factory
    interface Factory {
        fun get(): ExchangeViewModel
    }
}