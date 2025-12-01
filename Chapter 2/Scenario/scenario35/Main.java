package scenario35;

public class Main {
    public static void main(String[] args) {
        Product product=new Product("Shoe",10000.0);
        System.out.println(product.getDiscountedPrice());
        System.out.println(product.getDiscountedPrice(5.0));
    }
}
