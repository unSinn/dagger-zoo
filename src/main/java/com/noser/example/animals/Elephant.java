package com.noser.example.animals;

import javax.inject.Inject;

/**
 * Created by maechlerfa on 1/19/16.
 */
public class Elephant implements Animal {

    private String name;

    @Inject
    public Elephant(){
        name = "An Elephant";
    }

    @Override
    public String getName() {
        return name;
    }
}
