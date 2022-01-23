package luluk.example.exchangeRateApplication.ui.current

import android.view.LayoutInflater
import android.view.ViewGroup
import luluk.example.exchangeRateApplication.R
import luluk.example.exchangeRateApplication.databinding.FragmentExchangeCurrentBinding
import luluk.example.exchangeRateApplication.extension.viewModel
import luluk.example.exchangeRateApplication.ui.base.BaseFragment
import luluk.example.exchangeRateApplication.viewmodel.current.CurrentExchangeViewModel
import javax.inject.Inject

class CurrentExchangeFragment(layoutRes: Int = R.layout.fragment_exchange_current) : BaseFragment<FragmentExchangeCurrentBinding>(layoutRes) {

    @Inject
    lateinit var viewModelFactory: CurrentExchangeViewModel.Factory

    override val viewModel: CurrentExchangeViewModel by viewModel {
        viewModelFactory.get()
    }

    override fun inject() {
        componentProvider.inject(this)
    }

    override fun setupViews() {

    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentExchangeCurrentBinding {
        return FragmentExchangeCurrentBinding.inflate(inflater, container, false)
    }
}