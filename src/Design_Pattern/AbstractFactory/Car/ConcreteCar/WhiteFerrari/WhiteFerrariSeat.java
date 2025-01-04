package Design_Pattern.AbstractFactory.Car.ConcreteCar.WhiteFerrari;

import Design_Pattern.AbstractFactory.Car.AbstractCar.AbstractCompositionCar;

public class WhiteFerrariSeat implements AbstractCompositionCar.Seat {
    @Override
    public String createSeat() {
        System.out.println("White Ferrari Seat created");
        return "Ghế của Aizen";
    }
}
