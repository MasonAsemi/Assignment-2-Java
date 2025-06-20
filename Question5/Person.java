public class Person {
    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public void addWatchedMovie(Movie movie) {
        Watch watch = new Watch();
        System.out.println(name + " watched " + movie.getName());
    }

    public void getWatchedMovies() {
        System.out.println("Getting watched movies for " + name);
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}