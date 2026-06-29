package farm.service;

import java.util.HashMap;
import java.util.Map;

public class StrategyRegistry {
    private final Map<String, MaintenanceStrategy> strategies = new HashMap<>();

    public void register(MaintenanceStrategy strategy) {
        strategies.put(strategy.getTerrainType(), strategy);
    }

    public MaintenanceStrategy getStrategy(String terrainType) {
        MaintenanceStrategy strategy = strategies.get(terrainType);
        if (strategy == null) {
            throw new RuntimeException("Loại hình canh tác '" + terrainType + "' chưa được hệ thống IoT hỗ trợ");
        }
        return strategy;
    }
}
