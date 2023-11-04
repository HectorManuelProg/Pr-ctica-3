package net.iessochoa.hectormanuelgelardosabater.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import net.iessochoa.hectormanuelgelardosabater.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val model:MainActivityViewModel by viewModels()
    private val TAG = "mostrar log"
    //var num:Int = 0

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
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG, "onCreate")

        //iniciamos el contador. Si es la primera vez, a cero, si es una reconstrucción,
        // //lo hará al valor que tenía
        binding.tvNumero.text=model.contador.toString()
        binding.btSumaUno.setOnClickListener(){
        //sumamos uno
            model.sumaUno() //mostramos el valor
            binding.tvNumero.text=model.contador.toString()
        }

           /* binding.tvNumero.text=num.toString()

            binding.btSumaUno.setOnClickListener(){
                num++
            binding.tvNumero.text=num.toString()
        }*/

    }
}

