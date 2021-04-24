package edu.uw.echee.fragmentsexamplespr21

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import edu.uw.echee.fragmentsexamplespr21.databinding.ActivityHomeBinding

private const val ACCOUNT_KEY = "account"

fun startHomeActivity(context: Context, account: Account) = with(context) {
    startActivity(Intent(this, HomeActivity::class.java).apply {
        putExtra(ACCOUNT_KEY, account)
    })
}

class HomeActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.navHost) }
    private lateinit var binding: ActivityHomeBinding

    val numOfPosts = 12345
    val numOfNotifications = 1234
    val numOfGroups = 45
    val favoriteGroup = "OneWheel Riders"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            // Navigate to each corresponding fragment when clicking on a navigation item.
            navBarView.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.feed -> navController.navigate(NavGraphDirections.actionGlobalHomeFragment(null))
                    R.id.notifications -> navController.navigate(NavGraphDirections.actionGlobalNotificationsFragment(numOfNotifications))
                    R.id.groups -> navController.navigate(NavGraphDirections.actionGlobalGroupsFragment(numOfGroups, favoriteGroup))
                }
                true
            }
        }

        val extras: Bundle? = intent.extras
        if (extras != null) {
            // Pass intent extras from this activity to the starting fragment
                // IMPORTANT: if you setGraph programmatically like so, remember to delete app:navGraph="@navigation/nav_graph" from your NavHost fragment in your activity xml
            navController.setGraph(R.navigation.nav_graph, extras)
        }

        // This will make sure the Up/Back button shows up as navController changes fragments
        setupActionBarWithNavController(navController)
    }

    // This code is to make sure pressing the Up/Back button jumps back a previous fragment
    override fun onSupportNavigateUp(): Boolean = navController.navigateUp()
}
