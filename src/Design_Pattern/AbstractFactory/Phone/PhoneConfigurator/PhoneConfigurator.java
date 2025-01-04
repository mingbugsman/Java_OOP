package Design_Pattern.AbstractFactory.Phone.PhoneConfigurator;

import Design_Pattern.AbstractFactory.Phone.AbstractFactory.PhoneFactory;
import Design_Pattern.AbstractFactory.Phone.AbstractProduct.Phone;

public class PhoneConfigurator {
    private String screen;
    private String body;
    private String processor;

    public PhoneConfigurator setScreen(String screen) {
        this.screen = screen;
        return  this;
    }
    public PhoneConfigurator setBody(String body) {
        this.body = body;
        return this;
    }
    public PhoneConfigurator setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public Phone buildPhone(PhoneFactory factory) {
        return factory.createPhone(screen, body, processor);
    }
}
