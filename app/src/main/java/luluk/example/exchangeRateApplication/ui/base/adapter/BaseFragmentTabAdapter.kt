package luluk.example.exchangeRateApplication.ui.base.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

abstract class BaseFragmentTabAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    abstract val dataSource : BaseFragmentTabDataSource

    override fun getItemCount(): Int {
        return dataSource.count
    }

    override fun createFragment(position: Int): Fragment {
        return dataSource.getFragment(position)
    }

    fun createTitle(position: Int): String {
        return dataSource.getTitle(position)
    }
}