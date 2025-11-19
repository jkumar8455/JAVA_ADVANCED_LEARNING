package scenario1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
    private String name;
    private Integer employeeId;
    private String department;
    
    public Employee(String name, Integer employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }
    public Employee() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayEmployeeInfo(){
        System.out.println(this.getName()+" : "+this.getEmployeeId()+" : "+this.getDepartment());
    }
    
}

public class Scenarion1{
    public static void main(String[] args) {
        Employee emp1=new Employee("Jitendra",1,"Software");
        Employee emp2=new Employee("Divya",2,"HR");
        List<Employee> employees=new ArrayList<>(Arrays.asList(emp1,emp2));
        for(Employee employee:employees){
            employee.displayEmployeeInfo();
        }
    }
}