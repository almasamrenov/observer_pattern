public class BasketballNewsSubscriber implements ISportNewsSubscriber {
    private String name;

    public BasketballNewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsTitle) {
        System.out.println(name + " received a new basketball news article: " + newsTitle);
    }
}