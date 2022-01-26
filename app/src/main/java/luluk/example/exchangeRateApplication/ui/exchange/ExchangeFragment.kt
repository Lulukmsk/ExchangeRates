package luluk.example.exchangeRateApplication.ui.exchange

import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import luluk.example.exchangeRateApplication.R
import luluk.example.exchangeRateApplication.databinding.FragmentExchangeBinding
import luluk.example.exchangeRateApplication.ui.base.BaseFragment
import luluk.example.exchangeRateApplication.extension.viewModel
import luluk.example.exchangeRateApplication.ui.exchange.adapter.ExchangeFragmentTabAdapter
import luluk.example.exchangeRateApplication.viewmodel.exchange.ExchangeViewModel
import javax.inject.Inject

class ExchangeFragment(layoutRes: Int = R.layout.fragment_exchange) : BaseFragment<FragmentExchangeBinding>(layoutRes) {

    @Inject
    lateinit var viewModelFactory: ExchangeViewModel.Factory
    lateinit var tabAdapter: ExchangeFragmentTabAdapter
    lateinit var tabMediator: TabLayoutMediator

    override val viewModel: ExchangeViewModel by viewModel {
        viewModelFactory.get()
    }

    override fun inject() {
        componentProvider.inject(this)
    }

    override fun setupViews() {
        if(!this::tabAdapter.isInitialized){
            tabAdapter = ExchangeFragmentTabAdapter(this)
            binding.exchangePager.adapter = tabAdapter
            tabMediator = TabLayoutMediator( binding.exchangeTab, binding.exchangePager) { tab, position ->
                tab.text = tabAdapter.createTitle(position)
            }
            tabMediator.attach()
        }
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentExchangeBinding {
        return FragmentExchangeBinding.inflate(inflater,container, false)
    }
}