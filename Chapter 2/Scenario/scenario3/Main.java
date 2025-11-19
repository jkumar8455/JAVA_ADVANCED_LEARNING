package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1=new Car();
        vehicle1.setMaxSpeed(200);
        Vehicle vehicle2=new Bike();
        vehicle2.setMaxSpeed(180);
        List<Vehicle> vehicles=new ArrayList<>(Arrays.asList(vehicle1,vehicle2));
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle.getMaxSpeed());
            vehicle.move();
        }
    }
}
