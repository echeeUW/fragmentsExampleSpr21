package edu.uw.echee.fragmentsexamplespr21

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import edu.uw.echee.fragmentsexamplespr21.databinding.FragmentGroupsBinding


class GroupsFragment : Fragment() {

    private lateinit var favoriteGroup: String
    var numOfGroups = -1

    override fun onAttach(context: Context) {
        if (context is HomeActivity) {
            this.numOfGroups = context.numOfGroups
            this.favoriteGroup = context.favoriteGroup
        }

        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentGroupsBinding.inflate(inflater)

        with(binding) {
            tvGroupsMsg.text = "${numOfGroups} - my favorite group is: ${favoriteGroup}"
        }


        return binding.root
    }
}
