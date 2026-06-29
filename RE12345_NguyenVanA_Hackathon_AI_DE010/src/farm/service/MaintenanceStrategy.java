package farm.service;

public interface MaintenanceStrategy {
    double calculateBaseCost(int durationInMonths);
    String getLogMessage();
    String getTerrainType();
}
