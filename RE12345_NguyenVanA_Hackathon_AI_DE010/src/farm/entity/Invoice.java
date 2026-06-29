package farm.entity;

public class Invoice {
    private String farmId;
    private double baseCost;
    private String status;

    public Invoice(String farmId, double baseCost, String status) {
        this.farmId = farmId;
        this.baseCost = baseCost;
        this.status = status;
    }

    public String getFarmId() {
        return farmId;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public String getStatus() {
        return status;
    }
}
