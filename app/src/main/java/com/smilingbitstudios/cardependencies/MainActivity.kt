package com.smilingbitstudios.cardependencies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponents = DaggerCarComponents.create()
        //car = component.getCar()
        component.inject(this)
        car.drive()

    }
}