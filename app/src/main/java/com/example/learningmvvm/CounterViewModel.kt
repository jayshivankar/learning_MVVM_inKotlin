package com.example.learningmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel :ViewModel(){
    private val _count = mutableStateOf(0)

    // to expose the count as an immutable state
    val count:MutableState<Int> = _count

    fun increament(){
        _count.value++
    }

    fun decreament(){
        _count.value--
    }


}


