package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car2: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var wheels=Wheels()
        //var engine=Engine()

        //car =Car(wheels,engine)//manual(primitive) dependency injection
        //car=DaggerCarComponent.create().getCar()
        var carComponent=DaggerCarComponent.create()
        carComponent.inject(this)
        car.start()
        car2.start()
    }
}