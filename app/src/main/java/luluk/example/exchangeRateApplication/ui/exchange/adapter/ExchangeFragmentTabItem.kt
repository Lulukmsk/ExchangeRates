package luluk.example.exchangeRateApplication.ui.exchange.adapter

import androidx.fragment.app.Fragment
import luluk.example.exchangeRateApplication.ui.base.adapter.BaseFragmentTabItem

data class ExchangeFragmentTabItem(
    override val fragment: Fragment,
    override val title: String
) : BaseFragmentTabItem