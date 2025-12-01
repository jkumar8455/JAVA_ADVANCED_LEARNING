package scenario37;

public class Plane extends Vehicle{
    @Override
    public Double calculateTicketPrice(Double distance) {
        return distance*2.5;
    }
}
