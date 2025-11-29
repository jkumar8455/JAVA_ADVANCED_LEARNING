package scenario26;

public class Course implements Cloneable{
    private String name;
    private Integer duration;
    public Course(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Course [name=" + name + ", duration=" + duration + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
}
