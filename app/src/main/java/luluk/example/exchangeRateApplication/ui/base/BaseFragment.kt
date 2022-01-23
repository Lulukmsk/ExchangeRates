package luluk.example.exchangeRateApplication.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import luluk.example.exchangeRateApplication.di.DaggerApplication
import luluk.example.exchangeRateApplication.di.component.ExchangeRateComponent
import luluk.example.exchangeRateApplication.viewmodel.base.BaseViewModel

abstract class BaseFragment<Binding: ViewBinding>(layoutRes: Int) : Fragment(layoutRes) {

    abstract val viewModel: BaseViewModel

    val componentProvider: ExchangeRateComponent by lazy {
        (requireActivity().applicationContext as DaggerApplication).getApplicationComponent()
    }

    abstract fun inject()
    abstract fun setupViews()
    abstract fun setBinding(inflater: LayoutInflater, container: ViewGroup?) : Binding

    override fun onAttach(context: Context) {
        inject()
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private var _binding: Binding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = setBinding(inflater, container)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}