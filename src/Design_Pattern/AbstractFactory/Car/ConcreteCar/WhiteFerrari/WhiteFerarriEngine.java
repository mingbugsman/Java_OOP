package Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari;

import Design_Pattern.AbstractFactory.Car.AbstractCar.AbstractCompositionCar;

public class WhiteFerarriEngine implements AbstractCompositionCar.Engine {
    @Override
    public String createEngine() {
        System.out.println("White Ferrari Engine created");
        return "động cơ quỷ";
    }
}
