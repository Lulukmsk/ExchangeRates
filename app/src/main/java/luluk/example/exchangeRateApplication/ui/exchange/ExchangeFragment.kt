package luluk.example.exchangeRateApplication.ui.exchange

import luluk.example.exchangeRateApplication.R
import luluk.example.exchangeRateApplication.ui.base.BaseFragment
import luluk.example.exchangeRateApplication.ui.extension.viewModel
import luluk.example.exchangeRateApplication.viewmodel.exchange.ExchangeViewModel
import javax.inject.Inject

class ExchangeFragment(layoutRes: Int = R.layout.fragment_exchange_rate) : BaseFragment(layoutRes) {

    override fun inject() {
        componentProvider.inject(this)
    }

    @Inject
    lateinit var viewModelFactory: ExchangeViewModel.Factory

    override val viewModel: ExchangeViewModel by viewModel {
        viewModelFactory.get()
    }
}