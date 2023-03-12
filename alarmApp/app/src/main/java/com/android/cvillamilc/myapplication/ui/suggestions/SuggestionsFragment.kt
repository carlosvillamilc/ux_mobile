package com.android.cvillamilc.myapplication.ui.suggestions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.android.cvillamilc.myapplication.R
import com.android.cvillamilc.myapplication.databinding.FragmentSuggestionsBinding

class SuggestionsFragment : Fragment() {

    private var _binding: FragmentSuggestionsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val suggestionsViewModel =
            ViewModelProvider(this).get(SuggestionsViewModel::class.java)

        _binding = FragmentSuggestionsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        suggestionsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val buttonBack = root.findViewById<ImageButton>(R.id.imageButton_editAlarm_back)

        buttonBack.setOnClickListener {
            root.findNavController().navigate(R.id.action_suggestionsFragment_to_homeFragment)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}