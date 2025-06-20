public class Watch {
    private int rating;

    public Watch(int rating) {
        this.rating = rating;
    }

    public Watch() {
        this.rating = 0;
    }

    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
}