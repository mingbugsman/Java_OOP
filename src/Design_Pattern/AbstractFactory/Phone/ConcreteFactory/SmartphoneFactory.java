package Design_Pattern.AbstractFactory.Phone.ConcreteFactory;

import Design_Pattern.AbstractFactory.Phone.AbstractFactory.PhoneFactory;
import Design_Pattern.AbstractFactory.Phone.AbstractProduct.Phone;
import Design_Pattern.AbstractFactory.Phone.ConcreteProduct.SmartPhone;

public class SmartphoneFactory implements PhoneFactory {

    @Override
    public Phone createPhone(String screen, String body, String processor) {
        return new SmartPhone(screen, body,processor);
    }
}
