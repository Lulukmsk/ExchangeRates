package luluk.example.exchangeRateApplication.ui.exchange.adapter

import android.util.SparseArray
import androidx.annotation.IntDef
import androidx.fragment.app.Fragment
import luluk.example.exchangeRateApplication.ui.base.adapter.BaseFragmentTabDataSource
import luluk.example.exchangeRateApplication.ui.current.CurrentExchangeFragment
import luluk.example.exchangeRateApplication.ui.exchange.adapter.ExchangeFragmentTabDataSource.Type.Companion.FAVOURITE
import luluk.example.exchangeRateApplication.ui.exchange.adapter.ExchangeFragmentTabDataSource.Type.Companion.MAIN

class ExchangeFragmentTabDataSource : BaseFragmentTabDataSource {

    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @IntDef(MAIN, FAVOURITE)
    annotation class Type {
        companion object {
            const val MAIN = 0
            const val FAVOURITE = 1
        }
    }

    private val mFragmentTabItemsSparseArray: SparseArray<ExchangeFragmentTabItem> = SparseArray<ExchangeFragmentTabItem>()
        .apply {
            put(MAIN, ExchangeFragmentTabItem(CurrentExchangeFragment(), "Популярное"))
            put(FAVOURITE, ExchangeFragmentTabItem(CurrentExchangeFragment(), "Избранное"))
        }

    override val count: Int = mFragmentTabItemsSparseArray.size()

    override fun getFragment(position: Int): Fragment {
        return mFragmentTabItemsSparseArray[position].fragment
    }

    override fun getTitle(position: Int): String{
        return  mFragmentTabItemsSparseArray[position].title
    }
}