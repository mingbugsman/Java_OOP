package Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem;

public class DvDPlayer {
    public void insertDisc(String movie) {
        System.out.println("DVD inserted : " + movie);
    }
    public void play() {
        System.out.println("Playing DVD...");
    }
    public void stop() {
        System.out.println("Stopping DVD...");
    }
}
