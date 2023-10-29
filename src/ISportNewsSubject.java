public interface ISportNewsSubject {
    void registerSubscriber(String category, ISportNewsSubscriber subscriber);
    void removeSubscriber(String category, ISportNewsSubscriber subscriber);
    void notifySubscribers(String category, String newsTitle);

}
