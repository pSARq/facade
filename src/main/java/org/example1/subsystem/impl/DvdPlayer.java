package org.example1.subsystem.impl;

import org.example1.subsystem.interfaces.MediaPlayer;

public class DvdPlayer implements MediaPlayer {
    @Override
    public void on() {
        System.out.println("El reproductor de DVD esta prendido");
    }

    @Override
    public void play(String movie) {
        System.out.println("Reproduciendo película: " + movie);
    }

    @Override
    public void off() {
        System.out.println("El reproductor DVD esta apagado");
    }
}
