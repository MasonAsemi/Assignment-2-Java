public class Staff extends Employee {
    private String role;

    public Staff(String name, double hours, String role) {
        super(name, hours);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}