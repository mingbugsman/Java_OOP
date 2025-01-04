package Design_Pattern.Facade_Pattern.Home_Theater_System_Basic;

import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.HomeTheaterFacade.HomeTheaterFacade;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.DvDPlayer;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.Lights;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.SoundSystem;
import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem.TV;

public class Client {
    private String movie;
    TV tv = new TV();
    SoundSystem soundSystem = new SoundSystem();
    DvDPlayer dvDPlayer = new DvDPlayer();
    Lights lights = new Lights();
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv, soundSystem,dvDPlayer,lights);

    public void setMovieToWatch(String movie) {
        this.movie = movie;
    }
    public void watchMovie() {
        if (movie == null) {
            System.out.println("DvD is null,You have to call setMovie to watch");
            return;
        }
        homeTheaterFacade.watchMovie(movie);
        System.out.println();
    }
    public void EndMovie() {
        homeTheaterFacade.endMovie();
        setMovieToWatch(null);
    }

}
