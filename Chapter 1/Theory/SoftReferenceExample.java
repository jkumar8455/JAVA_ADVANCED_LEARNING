import java.lang.ref.SoftReference;

public class SoftReferenceExample { 
    public static void main(String[] args) { 
        SoftReference<String> softRef = new SoftReference<>(new String("Hello,World!")); 
        System.out.println("Soft reference: " + softRef.get()); 
    } 
} 