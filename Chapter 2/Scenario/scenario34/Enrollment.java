package scenario34;

public abstract class Enrollment {
    private Integer studentId;
    private String studentName;
    public Enrollment(Integer studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public Enrollment(){
        
    }
    
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public abstract void displayInfo();
}
