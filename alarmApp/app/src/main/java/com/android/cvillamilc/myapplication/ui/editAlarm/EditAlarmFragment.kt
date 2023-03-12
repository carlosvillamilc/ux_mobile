package com.android.cvillamilc.myapplication.ui.editAlarm

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.android.cvillamilc.myapplication.R
import com.android.cvillamilc.myapplication.databinding.FragmentEditAlarmBinding

class EditAlarmFragment : Fragment() {

    private var _binding: FragmentEditAlarmBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val configSuggestionsViewModel =
            ViewModelProvider(this).get(EditAlarmViewModel::class.java)

        _binding = FragmentEditAlarmBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val myVariable = arguments?.getString("myVariable")
        val bundle = arguments
        val typeValue = bundle?.getString("typeKey")
        Log.d("typeKey",typeValue.toString() ) // This will print "Hello World" in the logcat

        val textView: TextView = binding.textConfiguration

        if(typeValue.toString()=="Editar"){
            configSuggestionsViewModel.textEditAlarm.observe(viewLifecycleOwner) {
                textView.text = it
            }
        }
        else{
            configSuggestionsViewModel.textNewAlarm.observe(viewLifecycleOwner) {
                textView.text = it
            }
        }


        val spinnerHour1: Spinner = root.findViewById(R.id.spinner_hour1)
        // Create an ArrayAdapter using the string array and a default spinner layout
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.hour_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinnerHour1.adapter = adapter
            }
        }

        val spinnerMinute1: Spinner = root.findViewById(R.id.spinner_minute1)
        // Create an ArrayAdapter using the string array and a default spinner layout
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.hour_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinnerMinute1.adapter = adapter
            }
        }

        val spinnerAMPM1: Spinner = root.findViewById(R.id.spinner_ampm1)
        // Create an ArrayAdapter using the string array and a default spinner layout
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.am_pm_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinnerAMPM1.adapter = adapter
            }
        }

        val spinnerCategory: Spinner = root.findViewById(R.id.spinner_categoria)
        // Create an ArrayAdapter using the string array and a default spinner layout
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.category_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinnerCategory.adapter = adapter
            }
        }

        val spinnerFrequency: Spinner = root.findViewById(R.id.spinner_repetir)
        // Create an ArrayAdapter using the string array and a default spinner layout
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.frequency_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinnerFrequency.adapter = adapter
            }
        }

        val spinnerSound: Spinner = root.findViewById(R.id.spinner_sonido)
        // Create an ArrayAdapter using the string array and a default spinner layout
        getContext()?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.sound_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinnerSound.adapter = adapter
            }
        }
        val buttonBack = root.findViewById<ImageButton>(R.id.imageButton_editAlarm_back)

        buttonBack.setOnClickListener {
            root.findNavController().navigate(R.id.action_editAlarmFragment_to_homeFragment)
        }

        val buttonSave = root.findViewById<Button>(R.id.button_guardar)

        buttonSave.setOnClickListener {
            root.findNavController().navigate(R.id.action_editAlarmFragment_to_homeFragment)
        }

        val buttonCancel = root.findViewById<Button>(R.id.button_cancelar)

        buttonCancel.setOnClickListener {
            root.findNavController().navigate(R.id.action_editAlarmFragment_to_homeFragment)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}