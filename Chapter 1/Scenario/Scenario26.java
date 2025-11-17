public class Scenario26 {
    public static void main(String[] args) {
        String numberStr="1234f";
        try{
            int num=Integer.parseInt(numberStr);
            System.out.println(num);
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid Number Format :- "+numberStr);
        }
    }
}
