package luluk.example.exchangeRateApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import luluk.example.exchangeRateApplication.databinding.ActivityExchangeRateBinding

class ExchangeRateMainActivity : AppCompatActivity(R.layout.activity_exchange_rate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (applicationContext as ExchangeRateApp).getApplicationComponent()
            .inject(this)
    }
}