package Design_Pattern.AbstractFactory.Phone.ConcreteProduct;

import Design_Pattern.AbstractFactory.Phone.AbstractProduct.Phone;

public class SmartPhone extends Phone {
    public SmartPhone(String screen, String body, String processor) {
        this.screen = screen;
        this.body = body;
        this.processor = processor;
    }
    @Override
    public void displayInfo() {
        System.out.println("Smartphone Info: ");
        super.ShowDetails();
    }
    public void makeCall() {
        System.out.println("Already calling Demon...");
    }
}
