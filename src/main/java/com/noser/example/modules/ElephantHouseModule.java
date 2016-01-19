package com.noser.example.modules;

import com.noser.example.animals.Animal;
import com.noser.example.watersources.Fountain;
import com.noser.example.watersources.WaterSource;
import com.noser.example.animals.Elephant;
import dagger.Module;
import dagger.Provides;

/**
 * Created by maechlerfa on 1/19/16.
 */
@Module
public class ElephantHouseModule {
    @Provides
    Animal provideAnimal() {
        return new Elephant();
    }

    @Provides
    WaterSource provideWaterSource() {
        return new Fountain();
    }
}
