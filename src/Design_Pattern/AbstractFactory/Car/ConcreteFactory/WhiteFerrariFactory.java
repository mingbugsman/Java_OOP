package Design_Pattern.AbstractFactory.Car.ConcreteFactory;

import Design_Pattern.AbstractFactory.Car.AbstractCar.AbstractCompositionCar;
import Design_Pattern.AbstractFactory.Car.AbstractCar.Car;
import Design_Pattern.AbstractFactory.Car.AbstractFactory.CarFactory;
import Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari.WhiteFarrariWheel;
import Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari.WhiteFerarriEngine;
import Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari.WhiteFerrari;
import Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari.WhiteFerrariSeat;

public class WhiteFerrariFactory implements CarFactory {

    @Override
    public AbstractCompositionCar.Wheel createWheel() {
       return new WhiteFarrariWheel();
    }

    @Override
    public AbstractCompositionCar.Seat createSeat() {
        return  new WhiteFerrariSeat();
    }

    @Override
    public AbstractCompositionCar.Engine createEngine() {
        return  new WhiteFerarriEngine();
    }

    @Override
    public Car createCar() {
        AbstractCompositionCar.Wheel wheel = createWheel();
        AbstractCompositionCar.Engine engine = createEngine();
        AbstractCompositionCar.Seat seat = createSeat();
        return new WhiteFerrari(wheel, seat, engine);
    }

}
