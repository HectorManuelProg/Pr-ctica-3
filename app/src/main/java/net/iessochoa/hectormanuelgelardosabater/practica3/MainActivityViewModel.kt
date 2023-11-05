package net.iessochoa.hectormanuelgelardosabater.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val contador= MutableLiveData<Int>(0)
    private val asterisco = MutableLiveData<String>("")

    fun agregarAsterisco() {
        val asteriscosActuales = asterisco.value ?: ""
        asterisco.value = asteriscosActuales + " * "
    }

    fun getAsteriscos(): LiveData<String> {
        return asterisco
    }
    fun sumaUno(){
        contador.value = contador.value?.plus(1)
    }
    fun getContador(): LiveData<Int> {
        return contador
    }
}