package Design_Pattern.Observer_Pattern.DemoSubscriber;

public class PremiumSubscriber implements ISubscriber {
    @Override
    public void update(String context) {
        System.out.println("Premium account received update "+ context);
    }
}
