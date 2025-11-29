package scenario33;

public class Main {
    public static void main(String[] args) {
        Truck truck=new Truck(2000, "Diesel");
        System.out.println(truck.getFuleType());
        System.out.println(truck.getLoadCapacity());
    }
}
