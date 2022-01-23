package luluk.example.exchangeRateApplication.ui.favourite

import android.view.LayoutInflater
import android.view.ViewGroup
import luluk.example.exchangeRateApplication.R
import luluk.example.exchangeRateApplication.databinding.FragmentExchangeFavouriteBinding
import luluk.example.exchangeRateApplication.extension.viewModel
import luluk.example.exchangeRateApplication.ui.base.BaseFragment
import luluk.example.exchangeRateApplication.viewmodel.favourite.FavouriteExchangeViewModel
import javax.inject.Inject

class FavouriteExchangeFragment(layoutRes: Int = R.layout.fragment_exchange_favourite) : BaseFragment<FragmentExchangeFavouriteBinding>(layoutRes) {

    @Inject
    lateinit var viewModelFactory: FavouriteExchangeViewModel.Factory

    override val viewModel: FavouriteExchangeViewModel by viewModel {
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
    ): FragmentExchangeFavouriteBinding {
        return FragmentExchangeFavouriteBinding.inflate(inflater, container, false)
    }
}