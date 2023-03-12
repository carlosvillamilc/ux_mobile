package com.android.cvillamilc.myapplication.ui.suggestions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SuggestionsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Sugerencias"
    }
    val text: LiveData<String> = _text
}