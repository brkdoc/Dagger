package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims():Rims{
        println("rims module")
        return Rims()
    }
    @Provides
    fun provideTires():Tires{
        println("tires module")
        return Tires()
    }
    @Provides
    fun provideWheels(rims: Rims,tires: Tires):Wheels{
        println("Wheels Module")
        return Wheels(rims, tires )
    }

}