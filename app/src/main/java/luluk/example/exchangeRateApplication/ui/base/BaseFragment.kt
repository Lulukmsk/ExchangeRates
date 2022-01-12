package luluk.example.exchangeRateApplication.ui.base

import androidx.fragment.app.Fragment
import luluk.example.exchangeRateApplication.viewmodel.base.BaseViewModel

abstract class BaseFragment(layoutRes: Int) : Fragment(layoutRes) {

    abstract val viewModel: BaseViewModel
}