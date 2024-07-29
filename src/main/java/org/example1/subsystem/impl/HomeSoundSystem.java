package org.example1.subsystem.impl;

import org.example1.subsystem.interfaces.SoundSystem;

public class HomeSoundSystem implements SoundSystem {
    @Override
    public void on() {
        System.out.println("El sonido del sistema esta prendido");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("El volumen del sistema es de: " + level);
    }

    @Override
    public void off() {
        System.out.println("El sonido del sistema esta apagado");
    }
}
