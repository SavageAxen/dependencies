package com.smilingbitstudios.cardependencies

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims{
        return Rims()
    }

    @Provides
    fun provideTires():Tires{
        val tires=Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires):Wheels{
        return Wheels(rims, tires)
    }

}