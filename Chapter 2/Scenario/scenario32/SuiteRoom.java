package scenario32;

public class SuiteRoom implements Room{
    @Override
    public Double calculateRate() {
        return BASE_PRICE*2.25;
    }
}
