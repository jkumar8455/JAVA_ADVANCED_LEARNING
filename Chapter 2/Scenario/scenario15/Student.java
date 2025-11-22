package scenario15;

public class Student {
    private static Integer studnetCount=0;
    private String name;
    private String grade;
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        studnetCount++;
    }
    public static Integer getStudnetCount() {
        return studnetCount;
    }
    public static void setStudnetCount(Integer studnetCount) {
        Student.studnetCount = studnetCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
}
