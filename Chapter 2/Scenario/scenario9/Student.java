package scenario9;

public class Student {
    private static final Integer MAX_COURCES=8;
    private String studentName;
    private Integer courseEnrolled;
    
    public Student(String studentName, Integer courseEnrolled) {
        if(courseEnrolled>MAX_COURCES){
            throw new MaxCourseValidationException("You can not enroll more than "+MAX_COURCES+" courses");
        }
        this.studentName = studentName;
        this.courseEnrolled = courseEnrolled;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Integer getCourseEnrolled() {
        return courseEnrolled;
    }
    public void setCourseEnrolled(Integer courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }
    
}
