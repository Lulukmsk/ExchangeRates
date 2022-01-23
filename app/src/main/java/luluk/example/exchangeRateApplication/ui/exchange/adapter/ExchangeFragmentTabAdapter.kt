package luluk.example.exchangeRateApplication.ui.exchange.adapter

import androidx.fragment.app.Fragment
import luluk.example.exchangeRateApplication.ui.base.adapter.BaseFragmentTabAdapter
import luluk.example.exchangeRateApplication.ui.base.adapter.BaseFragmentTabDataSource

class ExchangeFragmentTabAdapter(fragment: Fragment): BaseFragmentTabAdapter(fragment) {
    override val dataSource: BaseFragmentTabDataSource = ExchangeFragmentTabDataSource()
}