package com.android.cvillamilc.myapplication.ui.configSuggestions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConfigSuggestionsViewModel : ViewModel() {

    private val _textSalud = MutableLiveData<String>().apply {
        value = "Salud"
    }
    val textSalud: LiveData<String> = _textSalud

    private val _textHabits = MutableLiveData<String>().apply {
        value = "Habitos"
    }
    val textHabits: LiveData<String> = _textHabits
}