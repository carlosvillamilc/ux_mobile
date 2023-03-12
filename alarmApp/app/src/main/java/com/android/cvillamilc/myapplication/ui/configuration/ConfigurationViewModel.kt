package com.android.cvillamilc.myapplication.ui.configuration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConfigurationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Configuración"
    }
    val text: LiveData<String> = _text
}