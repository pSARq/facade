package org.example1.facade;

import org.example1.subsystem.interfaces.Light;
import org.example1.subsystem.interfaces.MediaPlayer;
import org.example1.subsystem.interfaces.Projector;
import org.example1.subsystem.interfaces.SoundSystem;

public class HomeTheaterFacade implements HomeTheater {

    private final MediaPlayer mediaPlayer;
    private final Projector projector;
    private final Light light;
    private final SoundSystem soundSystem;

    public HomeTheaterFacade(MediaPlayer mediaPlayer, Projector projector, Light light, SoundSystem soundSystem) {
        this.mediaPlayer = mediaPlayer;
        this.projector = projector;
        this.light = light;
        this.soundSystem = soundSystem;
    }

    /*Facade con solo 2 métodos simples que por debajo conllevan varios pasos para realizar un fin específico.
    * En este caso iniciar y detener una película*/

    @Override
    public void watchMovie(String movie) {
        System.out.println("Preparando todo para iniciar la película");
        light.off();
        projector.on();
        projector.setInput(mediaPlayer);
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(10);
        mediaPlayer.on();
        mediaPlayer.play(movie);
    }

    @Override
    public void endMovie() {
        System.out.println("Finalizando película");
        light.on();
        projector.off();
        soundSystem.off();
        mediaPlayer.off();
    }
}
