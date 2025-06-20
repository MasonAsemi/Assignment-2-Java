public class Dog {
    private String breed;
    private String name;
    private Paw paw;


    public Dog() {
        this.breed = "";
        this.name = "";
        this.paw = new Paw(1);

    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
        this.paw = new Paw(1);
    }

    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Paw getPaw() {
        return paw;
    }
    
    public void setPaw(Paw paw) {
        this.paw = paw;
    }
    
}