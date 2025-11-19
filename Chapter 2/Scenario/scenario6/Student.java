package scenario6;

public class Student {
    public static final String schoolName="DAV Public School";
    private String studentName;
    private Integer rollNumber;
    public Student(String studentName, Integer rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }
    public Student() {
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Integer getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }
    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", schoolName="+schoolName+"]";
    }
    
}
