package net.iessochoa.hectormanuelgelardosabater.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
//var contador:Int=0
    private val contador= MutableLiveData<Int>(0)
    fun sumaUno(){
       // contador++
        contador.value= contador.value?.plus(1)
        //contador.value= contador.value+1
    }
    fun getContador(): LiveData<Int> {
        return contador
    }
}