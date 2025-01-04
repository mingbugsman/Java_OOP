package Design_Pattern.AbstractFactory.Phone;

import Design_Pattern.AbstractFactory.Phone.AbstractFactory.PhoneFactory;
import Design_Pattern.AbstractFactory.Phone.AbstractProduct.Phone;
import Design_Pattern.AbstractFactory.Phone.PhoneConfigurator.PhoneConfigurator;

public class PhoneApplication {
    private final Phone phone;
    public  PhoneApplication(PhoneFactory factory, PhoneConfigurator phoneConfigurator) {
        phone = phoneConfigurator.buildPhone(factory);
    }
    public void showPhoneInfo() {
        phone.displayInfo();
    }
    public void Call() {
        phone.makeCall();
    }
}
