package com.example.dagger2

import javax.inject.Inject

class DieselEngine:Engine {
    @Inject
    constructor(){}
    override fun start() {
        println("Diesel engine started")
    }

}