package org.example1.subsystem.impl;

import org.example1.subsystem.interfaces.Light;

public class TheaterLight implements Light {
    @Override
    public void on() {
        System.out.println("Las luces del teatro están prendidas");
    }

    @Override
    public void off() {
        System.out.println("Las luces del teatro están apagadas");
    }
}
