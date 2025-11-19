import java.util.ArrayList;
import java.util.List;

public class ThreadLocalExample { 
    private static ThreadLocal<List<Integer>> threadLocalValue = 
ThreadLocal.withInitial(() -> new ArrayList<>()); 
 
    public static void main(String[] args) { 
        new Thread(() -> { 
            threadLocalValue.get().add(5); 
            System.out.println("Thread 1: " + threadLocalValue.get()); 
        }).start(); 
 
        new Thread(() -> { 
            threadLocalValue.get().add(10);
            System.out.println("Thread 2: " + threadLocalValue.get()); 
        }).start(); 
    } 
} 