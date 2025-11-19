package scenario2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
    private String name;
    private Integer price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    public Product() {
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}

public class Scenarion2 {
    public static void main(String[] args) {
        Product p1 = new Product("Salt",20);
        Product p2= new Product("Paste",100);
        List<Product> productList=new ArrayList<>(Arrays.asList(p1,p2));
        for(Product product:productList){
            System.out.println(product);
        }
    }
}
