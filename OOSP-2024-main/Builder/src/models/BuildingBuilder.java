package models;

public class BuildingBuilder implements Builder {
    private Building building;

    @Override
    public void reset() {
        building = new Building();
    }

    @Override
    public void setType(String type) {
        building.setType(type);
    }

    @Override
    public void setFloors(int floors) {
        building.setFloors(floors);
    }

    @Override
    public void setMaterial(String material) {
        building.setMaterial(material);
    }

    @Override
    public void setArea(double area) {
        building.setArea(area);
    }

    public Building getBuilding() {
        return building;
    }
}