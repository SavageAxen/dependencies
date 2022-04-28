package com.smilingbitstudios.cardependencies

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {
    @Provides
    fun providesEngine(engine: PetrolEngine): Engine{
        return engine
    }
}