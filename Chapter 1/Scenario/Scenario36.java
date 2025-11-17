import java.math.BigInteger;

public class Scenario36 {
    public static void main(String[] args) {
        BigInteger bigInteger=BigInteger.valueOf(1);
        for(int i=1;i<=100;i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial :- "+bigInteger);
    }
}
