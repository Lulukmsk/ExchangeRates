package luluk.example.exchangeRateApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import luluk.example.exchangeRateApplication.databinding.ActivityExchangeRateBinding

class ExchangeRateMainActivity : AppCompatActivity(R.layout.activity_exchange_rate) {

    private lateinit var binding: ActivityExchangeRateBinding

    lateinit var navController: NavController
    lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (applicationContext as ExchangeRateApp).getApplicationComponent()
            .inject(this)

        binding = ActivityExchangeRateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHost.navController

        val graph = navController.navInflater.inflate(R.navigation.exchange_nav_graph)

        navController.graph = graph
    }
}