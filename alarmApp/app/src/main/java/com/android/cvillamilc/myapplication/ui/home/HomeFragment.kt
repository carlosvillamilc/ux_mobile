package com.android.cvillamilc.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.android.cvillamilc.myapplication.R
import com.android.cvillamilc.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val homeViewModel =
        //    ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val buttonEditAlarm1 = root.findViewById<Button>(R.id.button_edit_alarm1)

        buttonEditAlarm1.setOnClickListener {
            root.findNavController().navigate(R.id.action_homeFragment_to_editAlarmFragment)
        }
        val buttonEditAlarm2 = root.findViewById<Button>(R.id.button_edit_alarm2)

        buttonEditAlarm2.setOnClickListener {
            root.findNavController().navigate(R.id.action_homeFragment_to_editAlarmFragment)
        }

        val buttonEditAlarm3 = root.findViewById<Button>(R.id.button_edit_alarm3)

        buttonEditAlarm3.setOnClickListener {
            root.findNavController().navigate(R.id.action_homeFragment_to_editAlarmFragment)
        }


        /*val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}