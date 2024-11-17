package com.syzlnnuro.futour_app.ui.findout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FindOutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is find out Fragment"
    }
    val text: LiveData<String> = _text
}