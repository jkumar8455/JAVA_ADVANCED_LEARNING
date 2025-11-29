package scenario22;

public class TaxCalculator implements Calculator{
    public Double calculate(Double price){
        return price*0.18;
    }
}
