import java.util.HashSet;
import java.util.Set;;

public class Scenario37 {
    public static void main(String[] args) {
        int[] arr={11,22,3,3,2,1,4,5,5,6,5};
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:set){
            System.out.print(num+" ");
        }
    }
}
