class FootballNewsSubscriber implements ISportNewsSubscriber {
    private String name;

    public FootballNewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsTitle) {
        System.out.println(name + " received a new football news article: " + newsTitle);
    }
}