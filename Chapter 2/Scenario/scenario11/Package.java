package scenario11;

public class Package {
    private String trackingId;
    private String destination;
    private Double Weight;
    public Package() {
        this.trackingId="DEFAULT_TRACKING_ID";
    }
    public Package(String trackingId, String destination, Double weight) {
        this.trackingId = trackingId;
        this.destination = destination;
        Weight = weight;
    }
    public String getTrackingId() {
        return trackingId;
    }
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Double getWeight() {
        return Weight;
    }
    public void setWeight(Double weight) {
        Weight = weight;
    }
    @Override
    public String toString() {
        return "Package [trackingId=" + trackingId + ", destination=" + destination + ", Weight=" + Weight + "]";
    }
    
}
