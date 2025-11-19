package scenario10;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem("Phone", 12000.0);
        cart.addItem("Shoe", 4000.0);
        cart.displayCartInfo();
    }
}
