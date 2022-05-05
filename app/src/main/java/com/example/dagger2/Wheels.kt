package com.example.dagger2



class Wheels {

    lateinit var rims: Rims
    lateinit var tires: Tires
    constructor(rims: Rims,tires: Tires){
        this.rims=rims
        this.tires=tires
    }
}