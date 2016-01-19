package com.noser.example;

import com.noser.example.modules.ElephantHouseModule;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by maechlerfa on 1/19/16.
 */
@Singleton
@Component(modules = {ElephantHouseModule.class})
public interface DaggerElephantHouseComponent {
    Cage maker();
}
