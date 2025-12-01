package scenario34;

public class ParttimeEnrollment extends Enrollment {

    public ParttimeEnrollment(Integer studentId, String studentName) {
        super(studentId, studentName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void displayInfo() {
        System.out.println("Parttime Enrollment for Student "+this.getStudentName()+" with id "+this.getStudentId());
    }

}
