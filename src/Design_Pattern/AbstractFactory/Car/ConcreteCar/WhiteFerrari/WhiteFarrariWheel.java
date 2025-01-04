package Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari;

import Design_Pattern.AbstractFactory.Car.AbstractCar.AbstractCompositionCar;

public class WhiteFarrariWheel  implements AbstractCompositionCar.Wheel {


    @Override
    public String createWheel() {
        System.out.println("White Ferrari Wheel created");
        return "Lốp xe quỷ";
    }
}
