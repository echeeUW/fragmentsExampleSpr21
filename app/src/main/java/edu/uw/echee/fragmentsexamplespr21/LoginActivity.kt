package edu.uw.echee.fragmentsexamplespr21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import edu.uw.echee.fragmentsexamplespr21.databinding.ActivityLoginBinding
import kotlinx.parcelize.Parcelize

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {
            btnLogin.setOnClickListener {

            }
        }
    }
}


@Parcelize
data class Account(
        val name: String,
        val email: String,
        val numberOfPosts: Int
): Parcelable
