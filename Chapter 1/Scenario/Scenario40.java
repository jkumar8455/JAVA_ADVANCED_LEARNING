import java.util.*;
public class Scenario40 {

    public static int[] mergeTwoSortedArraysRemoveDuplicates(int[] arr1,int[] arr2){
        Set<Integer> set=new TreeSet<>();
        for(int x:arr1) set.add(x);
        for(int x:arr2) set.add(x);
        return set.stream().mapToInt(Integer::valueOf).toArray();
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,8,9,11};
        int[] arr2={2,4,5,6,8,10,12};
        int[] result=mergeTwoSortedArraysRemoveDuplicates(arr1,arr2);
        for(int x:result){
            System.out.print(x+" ");
        }
    }
}
