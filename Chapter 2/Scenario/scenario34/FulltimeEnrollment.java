package scenario34;

public class FulltimeEnrollment extends Enrollment {

    public FulltimeEnrollment(Integer studentId, String studentName) {
        super(studentId, studentName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void displayInfo() {
        System.out.println("Fulltime Enrollment for Student "+this.getStudentName()+" with id "+this.getStudentId());
    }

}
