package edu.uw.echee.fragmentsexamplespr21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import edu.uw.echee.fragmentsexamplespr21.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val safeArgs: HomeFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater)

        with(binding) {
            // This is retrieving the same account that was sent from Login activity
            tvNumOfPosts.text = safeArgs.account.toString()
        }
        return binding.root
    }

}
