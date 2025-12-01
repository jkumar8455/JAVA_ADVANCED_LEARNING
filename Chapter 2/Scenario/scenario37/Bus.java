package scenario37;

public class Bus extends Vehicle{

    @Override
    public Double calculateTicketPrice(Double distance) {
        return distance*1.5;
    }

}
