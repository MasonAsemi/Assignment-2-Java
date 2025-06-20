public class Student2 {
    private String name;
    private Transcript transcript;

    public Student2(String name, Transcript transcript) {
        this.name = name;
        this.transcript = transcript;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Transcript getTranscript() {
        return transcript;
    }
    
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
}
