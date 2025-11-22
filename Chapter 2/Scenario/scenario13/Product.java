package scenario13;

public class Product {
    private Double price;
    
    public Product(Double price) {
        this.price = price;
    }
    public Double getDiscountedPrice(){
        return price*0.95;
    }
    public Double getDiscountedPrice(int quantity){
        if(quantity<10){
            return price*0.95;
        }
        return price*0.90;
    }
}
