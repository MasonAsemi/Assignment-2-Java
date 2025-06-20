public class Transcript {
    private String course;
    private double grade;
    
    public Transcript(String course, double grade) {
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
}