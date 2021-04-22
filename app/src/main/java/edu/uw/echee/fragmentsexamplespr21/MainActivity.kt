package edu.uw.echee.fragmentsexamplespr21

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

//private const val ACCOUNT_KEY = "ACCOUNT_KEY"
//
//fun startHomeActivity(context: Context, account: Account) = with(context) {
//    startActivity(Intent(this, MainActivity::class.java).apply {
//        putExtra(ACCOUNT_KEY, account)
//    })
//}

class MainActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.navHost) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController.setGraph(R.navigation.nav_graph, Bundle().apply {
            putInt("numOfPosts", 50)
        })

        setupActionBarWithNavController(navController)


    }

    override fun onSupportNavigateUp() = navController.navigateUp()
}

/*
bottomNav.setOnNavigationItemSelectedListener(this@HomeActivity)
override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.... ->
            else -> false
*/
