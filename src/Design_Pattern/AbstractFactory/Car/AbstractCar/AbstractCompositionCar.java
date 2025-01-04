package Design_Pattern.AbstractFactory.Car.AbstractCar;

public class AbstractCompositionCar {
    public  interface Wheel {
        String createWheel();
    }
    public  interface  Seat {
        String createSeat();
    }
    public interface Engine {
        String createEngine();
    }
}
