package scenario21;

public class Manager extends Employee{

    public Manager(Integer employeeId, String name) {
        super(employeeId, name);
        //TODO Auto-generated constructor stub
    }

    public void assignTask(){
        System.out.println(this.getName()+" assigns task");
    }

    public void takeStatus(){
        System.out.println(this.getName()+" take status");
    }
}
