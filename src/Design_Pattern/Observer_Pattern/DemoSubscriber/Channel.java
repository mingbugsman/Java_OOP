package Design_Pattern.Observer_Pattern.DemoSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private final List<ISubscriber> subscribers = new ArrayList<>();

    // add a subscriber
    public void subscribe(ISubscriber s) {
        subscribers.add(s);
    }

    // remove a subscriber
    public void unSubscribe(ISubscriber s) {
        subscribers.remove(s);
    }
    private void notifySubscribers(String context) {
        for (ISubscriber s : subscribers) {
            s.update(context);
        }
    }
    public void manBusinessLogic() {
        String newState = "Channel will be livestream in the next 30 minutes";
        System.out.println("Channel : State changed to " + newState);
        notifySubscribers(newState);
    }
}
