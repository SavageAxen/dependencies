package com.smilingbitstudios.cardependencies

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    @Provides
    fun providesEngine(engine: DieselEngine):Engine{
        return engine
    }
}