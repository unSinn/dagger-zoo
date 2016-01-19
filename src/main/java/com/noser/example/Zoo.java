package com.noser.example;

import com.esotericsoftware.minlog.Log;

import javax.inject.Inject;

/**
 * Created by maechlerfa on 1/19/16.
 */
public class Zoo {

    @Inject
    Cage elephantCage;

    void printCages() {
        Log.info("elephantCage: " + elephantCage.getAnimal().getName());
    }
}
