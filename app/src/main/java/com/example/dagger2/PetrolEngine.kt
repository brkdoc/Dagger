package com.example.dagger2

import javax.inject.Inject

class PetrolEngine:Engine {
    @Inject
    constructor(){}
    override fun start() {
        println("Petrol engine started")
    }

}