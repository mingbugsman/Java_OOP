package Design_Pattern.Observer_Pattern.DemoSubscriber;

public class NormalSubscriber implements ISubscriber{
    @Override
    public void update(String context) {
        System.out.println("Subscriber received update " + context  );
    }
}
