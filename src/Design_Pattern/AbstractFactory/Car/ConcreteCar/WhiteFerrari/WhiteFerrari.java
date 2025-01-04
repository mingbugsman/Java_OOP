package Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari;

import Design_Pattern.AbstractFactory.Car.AbstractCar.AbstractCompositionCar;
import Design_Pattern.AbstractFactory.Car.AbstractCar.Car;

public class WhiteFerrari extends Car {
    public WhiteFerrari(AbstractCompositionCar.Wheel wheel,
                        AbstractCompositionCar.Seat seat,
                        AbstractCompositionCar.Engine engine) {
        super(wheel, seat, engine);
    }

    @Override
    public void displayCar() {
        System.out.println("Displaying White Ferrari car information:");
        System.out.println("Wheel model: " + wheel.createWheel());
        System.out.println("Seat model: " + seat.createSeat());
        System.out.println("Engine model: " + engine.createEngine());
    }

    @Override
    public void move() {
        System.out.println("White Ferrari max speed is 340 km/h");
    }
}
