package farm.entity;

public class FarmArea {
    private String id;
    private String name;
    private String terrainType;

    public FarmArea(String id, String name, String terrainType) {
        this.id = id;
        this.name = name;
        this.terrainType = terrainType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTerrainType() {
        return terrainType;
    }
}
