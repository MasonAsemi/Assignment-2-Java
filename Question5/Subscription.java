public abstract class Subscription {
    String address;

    public Subscription() {
        this.address = "";
    }

    public abstract void subscribe();

    public void setMessage(String message) {
        System.out.println("Message set: " + message);
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}