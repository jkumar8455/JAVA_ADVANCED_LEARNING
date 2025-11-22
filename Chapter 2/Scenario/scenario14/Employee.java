package scenario14;

public class Employee {
    public String name;
    private Double salary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displaySalary(){
        System.out.println("Salary :- "+this.salary);;
    }
}
