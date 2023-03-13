package com.android.cvillamilc.myapplication.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.cvillamilc.myapplication.R
import com.android.cvillamilc.myapplication.databinding.FragmentLoginBinding
import com.android.cvillamilc.myapplication.databinding.FragmentRecoverPasswordBinding
import com.android.cvillamilc.myapplication.databinding.FragmentRegisterBinding
import com.android.cvillamilc.myapplication.ui.editAlarm.EditAlarmFragment

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null

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

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val buttonRegister = root.findViewById<TextView>(R.id.button_register)
        buttonRegister.setOnClickListener {
            root.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
        val buttonBack = root.findViewById<ImageButton>(R.id.imageButton_back)
        buttonBack.setOnClickListener {

            root.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
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