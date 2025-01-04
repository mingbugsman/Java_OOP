package Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem;

public class SoundSystem {
    public void turnOn() {
        System.out.println("Sound system is ON");
    }
    public void setVolume(int level) {
        System.out.println("Volume set to " +level);
    }
    public void turnOff() {
        System.out.println("Sound system is OFF");
    }

}
