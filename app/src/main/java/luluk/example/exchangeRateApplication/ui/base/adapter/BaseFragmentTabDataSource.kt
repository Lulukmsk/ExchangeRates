package luluk.example.exchangeRateApplication.ui.base.adapter

import androidx.fragment.app.Fragment

interface BaseFragmentTabDataSource {
    fun getFragment(position: Int): Fragment

    fun getTitle(position: Int): String

    val count: Int
}