package edu.uw.echee.fragmentsexamplespr21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import edu.uw.echee.fragmentsexamplespr21.databinding.ActivityLoginBinding
import kotlinx.parcelize.Parcelize

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater).apply { setContentView(root) }

        title = "Login Screen"

        with(binding) {
            btnLogin.setOnClickListener {
                val email = etEmail.text.toString()
                val name = etName.text.toString()
                val numOfPosts = 12345
                val account = Account(name, email, numOfPosts)
                startHomeActivity(this@LoginActivity, account)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.login_menu_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.settings_item -> Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
            R.id.about_item -> Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

}


@Parcelize
data class Account(
        val name: String,
        val email: String,
        val numberOfPosts: Int
): Parcelable
