package scenario21;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager(1,"Shailendra");
        Employee employee=new Employee(2,"jitendra");
        // employee.assignTask();
        // employee.takeStatus();
        
        manager.login();
        manager.assignTask();
        manager.works();
        manager.takeStatus();
        manager.logout();
        employee.login();
        employee.works();
        employee.logout();
    }
}
