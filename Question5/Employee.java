public class Employee {
    protected String name;
    protected double hours;

    public Employee(String name, double hours) {
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hours * 20.0;
    }

    public double getWorkingHours() {
        return hours;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getHours() {
        return hours;
    }
    
    public void setHours(double hours) {
        this.hours = hours;
    }
}