package scenario6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Jitendra",1);
        Student student2=new Student("Nipun",2);
        List<Student> students=new ArrayList<>(Arrays.asList(student1,student2));
        for(Student student:students){
            System.out.println(student);
        }
    }
}
