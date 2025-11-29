package scenario32;

public class Main {
    public static void main(String[] args) {
        Room room1=new SingleRoom();
        Room room2=new SuiteRoom();
        System.out.println(room1.calculateRate());
        System.out.println(room2.calculateRate());
    }
}
