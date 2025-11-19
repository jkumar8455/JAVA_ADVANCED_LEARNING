import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class HashMapAndHashTable {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Hashtable<Integer,Integer> hashtable=new Hashtable<>();

        hashMap.put(null,null);
        hashMap.put(null, null);
        //hashtable does not allow null key and null value
        // hashtable.put(1, null); // nullpointer
        // hashtable.put(null, null); // nullpointer

        hashtable.put(1,5);
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        for(Map.Entry<Integer,Integer> entry: hashtable.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
    
        }
    }
}
