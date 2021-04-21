package edu.uw.echee.fragmentsexamplespr21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import edu.uw.echee.fragmentsexamplespr21.databinding.FragmentGroupsBinding


class GroupsFragment : Fragment() {

    private val safeArgs: GroupsFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentGroupsBinding.inflate(inflater)

        val numOfGroups: Int = safeArgs.numOfGroups

        with(binding) {
            tvGroupsMsg.text = "${safeArgs.numOfGroups} - my favorite group is: ${safeArgs.favoriteGroup}"
        }


        return binding.root
    }
}
