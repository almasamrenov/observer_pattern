public interface ISportNewsSubject {
    void registerSubscriber(String category, SportNewsSubscriber subscriber);
    void removeSubscriber(String category, SportNewsSubscriber subscriber);
    void notifySubscribers(String category, String newsTitle);

}
