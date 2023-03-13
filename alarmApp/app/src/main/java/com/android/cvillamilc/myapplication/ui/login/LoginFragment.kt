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
import com.android.cvillamilc.myapplication.ui.editAlarm.EditAlarmFragment

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null

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

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val textViewForgotPassword = root.findViewById<TextView>(R.id.textView_forgot_password)
        textViewForgotPassword.setOnClickListener {

            root.findNavController().navigate(R.id.action_loginFragment_to_recoverPasswordFragment)
        }

        val textViewRegister = root.findViewById<TextView>(R.id.textView_register)
        textViewRegister.setOnClickListener {

            root.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        val buttonLoginGoogle = root.findViewById<ImageButton>(R.id.imageButton_login_google)
        buttonLoginGoogle.setOnClickListener {

            root.findNavController().navigate(R.id.action_loginFragment_to_loginGoogleFragment)
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