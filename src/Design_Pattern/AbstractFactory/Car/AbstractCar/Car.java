package Design_Pattern.AbstractFactory.Car.AbstractCar;

public abstract class Car {
    protected AbstractCompositionCar.Wheel wheel;
    protected AbstractCompositionCar.Seat seat;
    protected AbstractCompositionCar.Engine engine;

    public Car(AbstractCompositionCar.Wheel wheel,
               AbstractCompositionCar.Seat seat,
               AbstractCompositionCar.Engine engine) {
        this.wheel = wheel;
        this.seat = seat;
        this.engine = engine;
    }

    public abstract void displayCar();

    public void move() {
        System.out.println("The car is moving");
    }

    public void showEngine() {
        engine.createEngine();
    }
}
