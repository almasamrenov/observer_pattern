public class Main {
    public static void main(String[] args) {
        SportNewsPublisher sportNewsPublisher = new SportNewsPublisher();

        ISportNewsSubscriber footballSubscriber1 = new FootballNewsSubscriber("Subscriber1");
        ISportNewsSubscriber footballSubscriber2 = new FootballNewsSubscriber("Subscriber2");
        ISportNewsSubscriber basketballSubscriber = new BasketballNewsSubscriber("Subscriber3");

        sportNewsPublisher.registerSubscriber("Football", footballSubscriber1);
        sportNewsPublisher.registerSubscriber("Football", footballSubscriber2);
        sportNewsPublisher.registerSubscriber("Basketball", basketballSubscriber);

        sportNewsPublisher.notifySubscribers("Football", "Messi Scores Hat-Trick!");
        sportNewsPublisher.notifySubscribers("Basketball", "NBA Finals Update");
        sportNewsPublisher.removeSubscriber("Football", footballSubscriber1);
        sportNewsPublisher.notifySubscribers("Football", "New Transfer Deals");
    }
}