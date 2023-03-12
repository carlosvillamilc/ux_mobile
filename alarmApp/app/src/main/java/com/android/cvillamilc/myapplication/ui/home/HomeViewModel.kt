package com.android.cvillamilc.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _text_alarm1 = MutableLiveData<String>().apply {
        value = "05:00"
    }
    val text_alarm1: LiveData<String> = _text_alarm1
}