package com.android.cvillamilc.myapplication.ui.editAlarm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EditAlarmViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Editar Alarma"
    }
    val text: LiveData<String> = _text
}