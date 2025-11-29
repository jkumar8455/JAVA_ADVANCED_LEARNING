package scenario22;

public class Main {
    public static void main(String[] args) {
        TaxCalculator TaxCalculator=new TaxCalculator();
        System.out.println(TaxCalculator.calculate(100.0));
        DiscountCalculator DiscountCalculator=new DiscountCalculator();
        System.out.println( DiscountCalculator.calculate(200.0));
    }
}
