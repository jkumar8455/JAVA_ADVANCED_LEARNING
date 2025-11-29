package scenario21;

public class Employee {
    private Integer employeeId;
    private String name;
    
    public Employee(Integer employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void login(){
        System.out.println(this.getName()+" login");
    }
    public void logout(){
        System.out.println(this.getName()+" logout");
    }
    public void works(){
        System.out.println(this.getName()+" works");
    }
}
