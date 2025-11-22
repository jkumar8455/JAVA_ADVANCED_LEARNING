package scenario12;

public class Doctor {
    private String name;
    private String specialization;
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    @Override
    public String toString() {
        return "Doctor [name=" + name + ", specialization=" + specialization + "]";
    }
    
}
