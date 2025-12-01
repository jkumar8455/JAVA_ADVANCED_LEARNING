package scenario37;

public class Main {
    public static void main(String[] args) {
        Vehicle bus=new Bus();
        Vehicle train=new Train();
        Vehicle plane=new Plane();
        System.out.println(bus.calculateTicketPrice(1000.0));
        System.out.println(train.calculateTicketPrice(1000.0));
        System.out.println(plane.calculateTicketPrice(1000.0));
    }
}
