package scenario10;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    List<CartItem> cartItems;
    
    public Cart() {
        cartItems=new ArrayList<>();
    }

    public void addItem(String name,Double price){
        cartItems.add(new CartItem(name, price));
    }
    public void displayCartInfo(){
        for(CartItem cartItem:cartItems){
            System.out.println(cartItem);
        }
    }
    private class CartItem{
        private String name;
        private Double price;
        
        public CartItem(String name, Double price) {
            this.name = name;
            this.price = price;
        }        
        @Override
        public String toString() {
            return "CartItem [name=" + name + ", price=" + price + "]";
        }
        
    }
}
