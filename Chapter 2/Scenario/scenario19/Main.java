package scenario19;

public class Main {
    public static void main(String[] args) {
        Order order=new Order();
        order.addOrderItem("shoes", 4000.0, "123", 2);
        order.addOrderItem("watch", 3000.0, "124", 4);
        order.displayOrderInfo();
    }
}
