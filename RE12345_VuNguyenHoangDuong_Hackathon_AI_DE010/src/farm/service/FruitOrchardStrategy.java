package farm.service;

public class FruitOrchardStrategy implements MaintenanceStrategy {
    @Override
    public double calculateBaseCost(int durationInMonths) {
        return durationInMonths * 1000000;
    }

    @Override
    public String getLogMessage() {
        return "Đang tính chi phí kiểm tra đường ống tưới nhỏ giọt cơ bản...";
    }

    @Override
    public String getTerrainType() {
        return "FRUIT_ORCHARD";
    }
}
