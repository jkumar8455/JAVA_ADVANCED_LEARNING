package scenario26;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course=new Course("JAVA", 4);
        Course copy=(Course) course.clone();
        System.out.println(copy);
    }
}
