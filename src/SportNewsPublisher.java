import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class SportNewsPublisher implements ISportNewsSubject {
    private Map<String, List<ISportNewsSubscriber>> subscribersByCategory = new HashMap<>();

    public void notifySubscribers(String category, String newsTitle) {
        List<ISportNewsSubscriber> subscribers = subscribersByCategory.get(category);
        if (subscribers != null) {
            for (ISportNewsSubscriber subscriber : subscribers) {
                subscriber.update(newsTitle);
            }
        }
    }

    @Override
    public void registerSubscriber(String category, ISportNewsSubscriber subscriber) {
        subscribersByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(subscriber);
    }

    @Override
    public void removeSubscriber(String category, ISportNewsSubscriber subscriber) {
        List<ISportNewsSubscriber> subscribers = subscribersByCategory.get(category);
        if (subscribers != null) {
            subscribers.remove(subscriber);
        }
    }
}