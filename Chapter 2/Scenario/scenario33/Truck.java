package scenario33;

public final class Truck {
    private Integer loadCapacity;
    private String fuleType;
    public Truck(Integer loadCapacity, String fuleType) {
        this.loadCapacity = loadCapacity;
        this.fuleType = fuleType;
    }
    public Integer getLoadCapacity() {
        return loadCapacity;
    }
    public String getFuleType() {
        return fuleType;
    }
    
}
