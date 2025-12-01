package scenario37;

public class Train extends Vehicle{
    @Override
    public Double calculateTicketPrice(Double distance) {
        return distance*0.9;
    }
}
