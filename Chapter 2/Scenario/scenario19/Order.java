package scenario19;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<OrderItem> orders;
    public Order(){
        orders=new ArrayList<>();
    }
    public void addOrderItem(String name,Double price,String orderId,Integer quantity){
        orders.add(new OrderItem(name, price, orderId, quantity));
    }
    public void displayOrderInfo(){
        for(OrderItem orderItem:orders){
            System.out.println(orderItem);
        }
    }
    class OrderItem{
        private String name;
        private Double price;
        private String orderId;
        private Integer quantity;
        public OrderItem(String name, Double price, String orderId, Integer quantity) {
            this.name = name;
            this.price = price;
            this.orderId = orderId;
            this.quantity = quantity;
        }
        @Override
        public String toString() {
            return "orderItem [name=" + name + ", price=" + price + ", orderId=" + orderId + ", quantity=" + quantity
                    + "]";
        }
        
    }
}
