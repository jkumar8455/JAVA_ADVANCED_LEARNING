package scenario3;

public class Vehicle {
    private Integer maxSpeed;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void move(){
        System.out.println(this.getClass().getSimpleName()+" can move with maxSpeed "+this.maxSpeed);
    }    
}
