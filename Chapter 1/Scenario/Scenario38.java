import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Scenario38 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
