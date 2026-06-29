package farm.service;

import farm.entity.FarmArea;
import farm.entity.Invoice;

public class FarmMaintenanceService {
    private final StrategyRegistry registry;

    public FarmMaintenanceService() {
        this.registry = new StrategyRegistry();
        registry.register(new RiceTerraceStrategy());
        registry.register(new StrawberryGreenhouseStrategy());
        registry.register(new FruitOrchardStrategy());
    }

    public FarmMaintenanceService(StrategyRegistry registry) {
        this.registry = registry;
    }

    public Invoice calculateMaintenanceCost(FarmArea farm, int durationInMonths) {
        System.out.println("Bắt đầu tính toán chi phí bảo trì hệ thống cho khu vực: " + farm.getName());

        MaintenanceStrategy strategy = registry.getStrategy(farm.getTerrainType());
        System.out.println(strategy.getLogMessage());

        double baseCost = strategy.calculateBaseCost(durationInMonths);

        return new Invoice(farm.getId(), baseCost, "CALCULATED");
    }
}
