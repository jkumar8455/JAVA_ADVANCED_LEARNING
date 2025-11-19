package scenario4;

public class Calculator {
    public Integer add(Integer a,Integer b){
        return a+b;
    }
    public Integer add(Integer a,Integer b,Integer c){
        return a+b+c;
    }
    public Integer add(Integer ...nums){
        Integer sum=0;
        for(Integer x:nums){
            sum+=x;
        }
        return sum;
    }
}
