package com.android.cvillamilc.myapplication.ui.editAlarm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EditAlarmViewModel : ViewModel() {

    private val _textEditarAlarm = MutableLiveData<String>().apply {
        value = "Editar Alarma"
    }
    val textEditAlarm: LiveData<String> = _textEditarAlarm

    private val _textNewAlarm = MutableLiveData<String>().apply {
        value = "Nueva Alarma"
    }
    val textNewAlarm: LiveData<String> = _textNewAlarm
}