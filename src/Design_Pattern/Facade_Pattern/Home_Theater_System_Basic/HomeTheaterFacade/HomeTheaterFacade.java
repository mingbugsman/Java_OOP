package Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.HomeTheaterFacade;

import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.DvDPlayer;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.Lights;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.SoundSystem;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.TV;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private DvDPlayer dvdPlayer;
    private Lights lights;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DvDPlayer dvdPlayer, Lights lights) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.soundSystem = soundSystem;
    }
    public void watchMovie(String movie) {
        System.out.println("Preparing to watch to move...");
        lights.dim(10);
        tv.turnOn();
        soundSystem.setVolume(15);
        dvdPlayer.insertDisc(movie);
        dvdPlayer.play();
        System.out.println("Enjoy your movie !");
    }
    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        tv.turnOff();
        soundSystem.turnOff();
    }
}
