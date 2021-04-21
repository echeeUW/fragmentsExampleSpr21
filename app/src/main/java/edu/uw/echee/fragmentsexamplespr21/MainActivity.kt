package edu.uw.echee.fragmentsexamplespr21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

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
