package com.example.calculator

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    // Menyimpan state angka counter agar aman saat layar diputar
    private val _count = mutableStateOf(0)
    val count: State<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        if (_count.value > 0) { // Opsional: mencegah angka minus
            _count.value--
        }
    }

    fun reset() {
        _count.value = 0
    }
}