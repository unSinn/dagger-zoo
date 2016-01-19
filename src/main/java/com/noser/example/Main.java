package com.noser.example;

import com.esotericsoftware.minlog.Log;

/**
 * Created by maechlerfa on 1/14/16.
 */
public class Main {

    public static void main(String... args) {
        Log.info("Welcome to the Dagger Zoo");
        Zoo zoo = new Zoo();
        zoo.printCages();
    }
}
