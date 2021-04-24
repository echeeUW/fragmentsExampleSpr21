package edu.uw.echee.fragmentsexamplespr21

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.uw.echee.fragmentsexamplespr21.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    override fun onAttach(context: Context) {
        if (context is HomeActivity) {
            context.numOfNotifications
        }
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentNotificationsBinding.inflate(inflater)

        return binding.root
    }

}
