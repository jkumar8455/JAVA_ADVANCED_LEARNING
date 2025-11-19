package scenario4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(2,5));
        System.out.println(calculator.add(2,5,7));
        System.out.println(calculator.add(2,5,7,14,9));
    }
}
