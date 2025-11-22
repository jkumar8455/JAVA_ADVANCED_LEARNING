package scenario20;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new ParttimeEmployee();
        Employee employee2=new FulltimeEmployee();
        System.out.println(employee1.calculateSalary());
        System.out.println(employee2.calculateSalary());
    }
}
