package luluk.example.exchangeRateApplication.ui.base

import android.content.Context
import androidx.fragment.app.Fragment
import luluk.example.exchangeRateApplication.di.DaggerApplication
import luluk.example.exchangeRateApplication.di.provider.ExchangeRateProvider
import luluk.example.exchangeRateApplication.viewmodel.base.BaseViewModel

abstract class BaseFragment(layoutRes: Int) : Fragment(layoutRes) {

    abstract val viewModel: BaseViewModel

    val componentProvider: ExchangeRateProvider by lazy {
        (requireActivity().applicationContext as DaggerApplication).getApplicationProvider()
    }

    abstract fun inject()

    override fun onAttach(context: Context) {
        inject()
        super.onAttach(context)
    }
}