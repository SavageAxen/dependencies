package com.smilingbitstudios.cardependencies

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    private val TAG="Engine"

    override fun start(){
        Log.d(TAG, "Petrol engine started")
    }
}