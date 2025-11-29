package scenario24;

public class Main {
    public static void main(String[] args) {
        Machine machine1=new Machine();        
        Machine machine2=new Machine();
        System.out.println(machine1.isOperational());
        Machine.operational=true;
        System.out.println(machine2.isOperational());
        System.out.println(machine1.isOperational());
    }
}
