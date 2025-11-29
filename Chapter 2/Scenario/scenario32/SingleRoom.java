package scenario32;

public class SingleRoom implements Room{

    @Override
    public Double calculateRate() {
        return BASE_PRICE*1.25;
    }

}
