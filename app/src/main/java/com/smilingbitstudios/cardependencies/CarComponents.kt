//This is the "INJECTOR" par of DAGger


package com.smilingbitstudios.cardependencies

import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponents {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity){}

}