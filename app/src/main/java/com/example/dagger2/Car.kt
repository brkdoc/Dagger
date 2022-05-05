package com.example.dagger2

import javax.inject.Inject

class Car {
    @Inject
    lateinit var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(engine: Engine){
        this.engine=engine
    }
    @Inject
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }

    fun start(){
        println("wheels : "+wheels)
        engine.start()
        println("driving...")
    }
}