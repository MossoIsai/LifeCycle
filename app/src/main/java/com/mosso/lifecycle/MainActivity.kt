package com.mosso.lifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG =  MainActivity::class.java.simpleName

    /**
     *     3 Primeros metodos al crear la aplicacion
     *     onCreate
     *     onStart
     *     onResume
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    /**
     * 2 Metodos en crear al irse dejar bloqueado el Telefon
     * onPause
     * onStop
     */

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    /** Al Volver cargar la aplicacionn
     * onRestart
     * onStart
     * onResume
     * onPause
     * onResume
     */

    /** Volver a al activity cuando esta en Background
     * onRestart
     * onStart
     * onResume
     */
}

