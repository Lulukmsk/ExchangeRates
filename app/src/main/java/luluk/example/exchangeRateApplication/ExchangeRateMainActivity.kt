package luluk.example.exchangeRateApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class ExchangeRateMainActivity : AppCompatActivity(R.layout.activity_exchange_rate) {

    lateinit var navController: NavController
    lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange_rate)

        navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHost.navController

        val graph = navController.navInflater.inflate(R.navigation.exchange_nav_graph)

        navController.graph = graph
    }
}