package farm.service;

public class GinsengValleyStrategy implements MaintenanceStrategy {
    @Override
    public double calculateBaseCost(int durationInMonths) {
        return durationInMonths * 5500000;
    }

    @Override
    public String getLogMessage() {
        return "Đang tính chi phí duy trì độ ẩm không khí và che nắng cho Vườn sâm thung lũng...";
    }

    @Override
    public String getTerrainType() {
        return "GINSENG_VALLEY";
    }
}
