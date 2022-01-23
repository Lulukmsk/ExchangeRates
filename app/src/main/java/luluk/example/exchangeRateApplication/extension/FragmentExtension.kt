package luluk.example.exchangeRateApplication.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

inline fun <reified VM : ViewModel> Fragment.viewModel(
    crossinline viewModelProducer: () -> VM
): Lazy<VM> = lazy {
    createViewModel(createFactory(viewModelProducer))
}

inline fun <reified VM : ViewModel> Fragment.createViewModel(
    factory: ViewModelProvider.Factory
): VM {
    val viewModelProvider = ViewModelProvider(this, factory)
    return viewModelProvider[VM::class.java]
}

inline fun <reified VM : ViewModel> createFactory(
    crossinline viewModelProducer: () -> VM
) :ViewModelProvider.Factory {
    return object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <VM : ViewModel> create(modelClass: Class<VM>) = viewModelProducer() as VM
    }
}