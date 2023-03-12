package com.android.cvillamilc.myapplication.ui.configSuggestions

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.android.cvillamilc.myapplication.R
import com.android.cvillamilc.myapplication.databinding.FragmentConfigSuggestionsBinding

class ConfigSuggestionsFragment : Fragment() {

    private var _binding: FragmentConfigSuggestionsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val configSuggestionsViewModel =
            ViewModelProvider(this).get(ConfigSuggestionsViewModel::class.java)

        _binding = FragmentConfigSuggestionsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textViewConfigSuggestionsType

        val bundle = arguments
        val typeValue = bundle?.getString("typeKey")

        if(typeValue.toString()=="Salud"){
            configSuggestionsViewModel.textSalud.observe(viewLifecycleOwner) {
                textView.text = it
            }
            val buttonHealth = root.findViewById<ImageButton>(R.id.imageButton_health)
            buttonHealth.setVisibility(View.VISIBLE);
            val textViewHealth = root.findViewById<TextView>(R.id.textView_app_health)
            textViewHealth.setVisibility(View.VISIBLE);
        }
        else{
            configSuggestionsViewModel.textHabits.observe(viewLifecycleOwner) {
                textView.text = it
            }
            val buttonSport = root.findViewById<ImageButton>(R.id.imageButton_sport)
            buttonSport.setVisibility(View.VISIBLE);
            val textViewSport = root.findViewById<TextView>(R.id.textView_app_sport)
            textViewSport.setVisibility(View.VISIBLE);

            val buttonReading = root.findViewById<ImageButton>(R.id.imageButton_book)
            buttonReading.setVisibility(View.VISIBLE);
            val textViewReading = root.findViewById<TextView>(R.id.textView_app_book)
            textViewReading.setVisibility(View.VISIBLE);

            val buttonStudy = root.findViewById<ImageButton>(R.id.imageButton_study)
            buttonStudy.setVisibility(View.VISIBLE);
            val textViewStudy = root.findViewById<TextView>(R.id.textView_app_study)
            textViewStudy.setVisibility(View.VISIBLE);

        }

        val buttonBack = root.findViewById<ImageButton>(R.id.imageButton_configSuggestions_back)

        buttonBack.setOnClickListener {
            root.findNavController().navigate(R.id.action_configSuggestionsFragment_to_configurationFragment)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}