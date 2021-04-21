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

    private val navController by lazy { findNavController() }

    private val safeArgs: HomeFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater)

        with(binding) {
            tvNumOfPosts.text = safeArgs.numOfPosts.toString()

            ibNewsFeed.setOnClickListener{
                Toast.makeText(requireContext(), "You clicked on News feed", Toast.LENGTH_SHORT).show()
            }

            ibGroups.setOnClickListener {
                navController.navigate(HomeFragmentDirections.actionHomeFragmentToGroupsFragment2(numOfGroups = 38, favoriteGroup = "Subtle Asian Traits"))
            }

            ibNotifications.setOnClickListener {
                navController.navigate(HomeFragmentDirections.actionHomeFragmentToNotificationsFragment(numOfNotifications = 12))
            }
        }


        return binding.root
    }

}
