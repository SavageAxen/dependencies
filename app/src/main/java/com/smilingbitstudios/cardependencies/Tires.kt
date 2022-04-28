package com.smilingbitstudios.cardependencies

import android.util.Log
import javax.inject.Inject

class Tires @Inject constructor() {
    private val TAG="Tires"
    fun inflate() {
        Log.d(TAG, "Tires inflated...")
    }
//    val result: Tires[]
//    for(i in 0 .. tires){
//        result[i]=Tire()
//    }
//    return result
}