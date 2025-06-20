public class Ticket extends Subscription {

    public Ticket() {
        super();
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to ticket service at address: " + address);
    }
}