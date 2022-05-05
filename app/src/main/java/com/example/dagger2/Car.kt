package com.example.dagger2

import javax.inject.Inject

class Car {
    var wheels: Wheels
    var engine: Engine

    @Inject
    constructor(wheels: Wheels,engine: Engine){
        this.wheels=wheels
        this.engine=engine
    }
    @Inject
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }

    fun start(){
        engine.start()
        println("driving...")
    }
}