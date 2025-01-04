package Design_Pattern.AbstractFactory.Phone.AbstractFactory;

import Design_Pattern.AbstractFactory.Phone.AbstractProduct.Phone;

public interface PhoneFactory {
    Phone createPhone(String screen, String body, String processor);
}
