public class Magazine extends Subscription {

    public Magazine() {
        super();
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to magazine at address: " + address);
    }
}