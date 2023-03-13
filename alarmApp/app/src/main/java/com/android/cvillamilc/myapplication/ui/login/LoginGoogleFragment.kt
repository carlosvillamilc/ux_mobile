package com.android.cvillamilc.myapplication.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.cvillamilc.myapplication.LoginActivity
import com.android.cvillamilc.myapplication.R
import com.android.cvillamilc.myapplication.databinding.FragmentLoginBinding
import com.android.cvillamilc.myapplication.databinding.FragmentLoginGoogleBinding
import com.android.cvillamilc.myapplication.ui.editAlarm.EditAlarmFragment

class LoginGoogleFragment : Fragment() {

    private var _binding: FragmentLoginGoogleBinding? = null

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

        _binding = FragmentLoginGoogleBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val buttonLoginGoogle = root.findViewById<ImageButton>(R.id.imageButton_login_google)
        buttonLoginGoogle.setOnClickListener {

            //root.findNavController().navigate(R.id.action_loginGoogleFragment_to_loginFragment)
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }

        val buttonBack = root.findViewById<ImageButton>(R.id.imageButton_back)
        buttonBack.setOnClickListener {

            root.findNavController().navigate(R.id.action_loginGoogleFragment_to_loginFragment)
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