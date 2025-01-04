package Design_Pattern.AbstractFactory.Car.Client;

import Design_Pattern.AbstractFactory.Car.AbstractCar.Car;
import Design_Pattern.AbstractFactory.Car.AbstractFactory.CarFactory;

public class CarApplication {
    private final Car car;

    public CarApplication(CarFactory factory) {
        car = factory.createCar();
    }
    public void moveCar() {
        car.move();
    }
    public void InformationCar() {
        car.displayCar();
    }

}
