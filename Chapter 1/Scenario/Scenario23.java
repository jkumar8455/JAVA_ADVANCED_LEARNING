public class Scenario23 {
    public static void main(String[] args) {
        int[] arr={5,3,5,10,25,2,23,13};
        int mini=arr[0],maxi=arr[0];
        for(int x:arr){
            if(x>maxi) maxi=x;
            if(x<mini) mini=x;
        }
        System.out.println("minimum :- "+mini);
        System.out.println("maximum :- "+maxi);
    }
}
