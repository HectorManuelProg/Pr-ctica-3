package net.iessochoa.hectormanuelgelardosabater.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import net.iessochoa.hectormanuelgelardosabater.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val model:MainActivityViewModel by viewModels()
    private val TAG = "mostrar log"

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }
    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }
    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG, "onCreate")

        model.getContador().observe(this, Observer<Int>{
                cont-> binding.tvNumero.text=cont.toString()
        })
        model.getAsteriscos().observe(this, Observer<String> {
                asteriscos -> binding.tvAsterisco.text = asteriscos
        })

        binding.btSumaUno.setOnClickListener(){
        //Le indicamos al viewmodel que sume uno
            model.agregarAsterisco()
            model.sumaUno() //mostramos el valor
        }
    }
}

