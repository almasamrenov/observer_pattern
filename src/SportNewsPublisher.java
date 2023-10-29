import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class SportNewsPublisher implements ISportNewsSubject {
    private Map<String, List<SportNewsSubscriber>> subscribersByCategory = new HashMap<>();

    public void notifySubscribers(String category, String newsTitle) {
        List<SportNewsSubscriber> subscribers = subscribersByCategory.get(category);
        if (subscribers != null) {
            for (SportNewsSubscriber subscriber : subscribers) {
                subscriber.update(newsTitle);
            }
        }
    }

    @Override
    public void registerSubscriber(String category, SportNewsSubscriber subscriber) {
        subscribersByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(subscriber);
    }

    @Override
    public void removeSubscriber(String category, SportNewsSubscriber subscriber) {
        List<SportNewsSubscriber> subscribers = subscribersByCategory.get(category);
        if (subscribers != null) {
            subscribers.remove(subscriber);
        }
    }
}