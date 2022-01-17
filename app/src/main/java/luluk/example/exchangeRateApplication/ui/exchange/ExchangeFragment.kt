package luluk.example.exchangeRateApplication.ui.exchange

import luluk.example.exchangeRateApplication.di.component.ExchangeRateComponent
import luluk.example.exchangeRateApplication.ui.base.BaseFragment
import luluk.example.exchangeRateApplication.ui.extension.viewModel
import luluk.example.exchangeRateApplication.viewmodel.exchange.ExchangeViewModel
import javax.inject.Inject

abstract class ExchangeFragment(layoutRes: Int) : BaseFragment(layoutRes) {

    override fun inject() {
        ExchangeRateComponent.Builder.component?.inject(this)
    }

    @Inject
    lateinit var viewModelFactory: ExchangeViewModel.Factory

    override val viewModel: ExchangeViewModel by viewModel {
        viewModelFactory.get()
    }
}