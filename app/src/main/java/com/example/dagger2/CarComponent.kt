package com.example.dagger2

import dagger.Component

@Component(modules=[PetrolEngineModule::class,WheelsModule::class])
interface CarComponent {
    fun getCar():Car
    fun inject(mainActivity: MainActivity)
}