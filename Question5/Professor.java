public class Professor extends Employee {
    private String title;

    public Professor(String name, double hours, String title) {
        super(name, hours);
        this.title = title;
    }

    @Override
    public double calculateSalary() {
        return hours * 20.0; // 
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
}
