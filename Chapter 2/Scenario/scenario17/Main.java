package scenario17;

public  class Main {
    public static void main(String[] args) {
        Course course1=new OnlineCourse();
        Course course2= new OfflineCourse();
        System.out.println(course1.calculateFee());
        System.out.println(course2.calculateFee());
    }
}
