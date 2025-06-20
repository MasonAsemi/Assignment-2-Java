public class Player {
    private String name;
    private boolean expert;

    public Player(String name, boolean expert) {
        this.name = name;
        this.expert = expert;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isExpert() {
        return expert;
    }
    
    public void setExpert(boolean expert) {
        this.expert = expert;
    }
}