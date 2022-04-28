package com.smilingbitstudios.cardependencies

import javax.inject.Inject

class Car @Inject constructor(wheels: Wheels) {
    @Inject lateinit var engine: Engine

    public fun drive(){
        println("Now driving car...")
    }

    @Inject
    fun enableRemoteKey(remote: Remote){
        engine.start()
        remote.setListener(this)
    }

}