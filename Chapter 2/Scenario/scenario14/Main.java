package scenario14;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("jitendra", 20000.0);
        System.out.println(employee.name);
        // System.out.println(employee.salary); salary is not visible
        employee.displaySalary();
    }
}
