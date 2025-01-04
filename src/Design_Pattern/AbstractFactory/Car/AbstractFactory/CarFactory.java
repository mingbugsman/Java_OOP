package Design_Pattern.AbstractFactory.Car.AbstractFactory;

import Design_Pattern.AbstractFactory.Car.AbstractCar.AbstractCompositionCar;
import Design_Pattern.AbstractFactory.Car.AbstractCar.Car;

public interface CarFactory {
   AbstractCompositionCar.Wheel createWheel();
   AbstractCompositionCar.Seat createSeat();
   AbstractCompositionCar.Engine createEngine();
    Car createCar();
}
