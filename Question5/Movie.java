public class Movie {
    private String name;
    private String genre;

    public Movie() {
        this.name = "";
        this.genre = "";
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void addWatchedMovie(Watch watch) {
        System.out.println("Movie " + name + " was watched");
    }

    public void getWatchedMovies() {
        System.out.println("Getting: " + name);
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
