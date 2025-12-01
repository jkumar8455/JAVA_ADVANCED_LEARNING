package scenario34;

public class Main {
    public static void main(String[] args) {
        Enrollment enrollment1=new ParttimeEnrollment(1, "jitendra");
        Enrollment enrollment2=new FulltimeEnrollment(2, "nipun");
        enrollment1.displayInfo();
        enrollment2.displayInfo();
    }
}
