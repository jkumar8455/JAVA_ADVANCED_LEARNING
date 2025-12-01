package scenario39;

public class Main {
    public static void main(String[] args) {
        Department department=new Department("department@gmail.com", "9876543210");
        System.out.println(department.getEmail());
        System.out.println(department.getPhoneNumber());
    }
}
