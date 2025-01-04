package Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.SubSystem;

public class Lights {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%");
    }
    public void turnOne() {
        System.out.println("Lights are on ");
    }
}
