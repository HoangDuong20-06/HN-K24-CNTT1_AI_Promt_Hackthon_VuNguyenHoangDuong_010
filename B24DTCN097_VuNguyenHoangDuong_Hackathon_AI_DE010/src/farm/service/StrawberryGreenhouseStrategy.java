package farm.service;

public class StrawberryGreenhouseStrategy implements MaintenanceStrategy {
    @Override
    public double calculateBaseCost(int durationInMonths) {
        return durationInMonths * 4000000;
    }

    @Override
    public String getLogMessage() {
        return "Đang tính chi phí hiệu chuẩn cảm biến nhiệt đới và hệ thống phun sương...";
    }

    @Override
    public String getTerrainType() {
        return "STRAWBERRY_GREENHOUSE";
    }
}
