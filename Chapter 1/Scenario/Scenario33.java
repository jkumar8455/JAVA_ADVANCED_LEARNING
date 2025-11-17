import java.util.HashMap;
import java.util.Map;

public class Scenario33 {
    public static void main(String[] args) {
        Map<Character,Integer> freq = new HashMap<>();
        String s="swiss";
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
