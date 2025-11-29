package scenario25;

public class Delivery {
    private static int counter=0;
    public static int generateDeliveryId(){
        return ++counter;
    }
}
