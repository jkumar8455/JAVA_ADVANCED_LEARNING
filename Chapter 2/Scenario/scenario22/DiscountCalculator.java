package scenario22;

public class DiscountCalculator implements Calculator {
    public Double calculate(Double price){
        return price*0.95;
    }
}
