package org.example1.subsystem.impl;

import org.example1.subsystem.interfaces.MediaPlayer;
import org.example1.subsystem.interfaces.Projector;

public class HomeProjector implements Projector {
    @Override
    public void on() {
        System.out.println("El proyector esta prendido");
    }

    @Override
    public void setInput(MediaPlayer mediaPlayer) {
        System.out.println("La entrada del proyector es: " + mediaPlayer);
    }

    @Override
    public void wideScreenMode() {
        System.out.println("Proyector en modo de pantalla completa");
    }

    @Override
    public void off() {
        System.out.println("El proyector esta apagado");
    }
}
