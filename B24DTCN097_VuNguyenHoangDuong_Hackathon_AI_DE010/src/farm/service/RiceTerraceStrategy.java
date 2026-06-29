package farm.service;

public class RiceTerraceStrategy implements MaintenanceStrategy {
    @Override
    public double calculateBaseCost(int durationInMonths) {
        return durationInMonths * 2500000;
    }

    @Override
    public String getLogMessage() {
        return "Đang tính phụ phí bảo trì trạm bơm áp suất cao cho ruộng bậc thang...";
    }

    @Override
    public String getTerrainType() {
        return "RICE_TERRACES";
    }
}
