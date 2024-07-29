package org.example1;

import org.example1.facade.HomeTheater;
import org.example1.facade.HomeTheaterFacade;
import org.example1.subsystem.impl.DvdPlayer;
import org.example1.subsystem.impl.HomeProjector;
import org.example1.subsystem.impl.HomeSoundSystem;
import org.example1.subsystem.impl.TheaterLight;
import org.example1.subsystem.interfaces.Light;
import org.example1.subsystem.interfaces.MediaPlayer;
import org.example1.subsystem.interfaces.Projector;
import org.example1.subsystem.interfaces.SoundSystem;

public class Main {
    private static final String NAME_OF_THE_MOVIE = "Son como niños";

    public static void main(String[] args) {
        /*Conjunto de clases que pertenecen a una libreria o subsistema complejo*/
        MediaPlayer dvdPlayer = new DvdPlayer();
        Projector homeProjector = new HomeProjector();
        Light theaterLight = new TheaterLight();
        SoundSystem homeSoundSystem = new HomeSoundSystem();

        /*Creación del facade para evitar realizar el uso de la libreria en esta parte y asi abstraer toda esa logica compleja*/
        HomeTheater homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, homeProjector, theaterLight, homeSoundSystem);

        /*Uso del facade*/
        homeTheaterFacade.watchMovie(NAME_OF_THE_MOVIE);
        homeTheaterFacade.endMovie();

    }
}