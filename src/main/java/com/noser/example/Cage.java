package com.noser.example;

import com.noser.example.animals.Animal;
import com.noser.example.watersources.WaterSource;

import javax.inject.Inject;

/**
 * Created by maechlerfa on 1/19/16.
 */
public class Cage {

    private final Animal animal;
    private final WaterSource waterSource;

    @Inject
    public Cage(Animal animal, WaterSource waterSource) {
        this.animal = animal;
        this.waterSource = waterSource;
    }


    public Animal getAnimal() {
        return animal;
    }
}
