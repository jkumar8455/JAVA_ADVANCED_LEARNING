package scenario12;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon=new Surgeon("Jack");
        GeneralPractitioner generalPractitioner=new GeneralPractitioner("Jimmy");
        System.out.println(surgeon);
        System.out.println(generalPractitioner);
    }
}
