package models;

public class Director {
    public void constructSkyscraper(BuildingBuilder builder) {
        builder.reset();
        builder.setType("Skyscraper");
        builder.setFloors(50);
        builder.setMaterial("Steel and Glass");
        builder.setArea(20000.0);
    }

    public void constructHouse(BuildingBuilder builder) {
        builder.reset();
        builder.setType("House");
        builder.setFloors(2);
        builder.setMaterial("Brick");
        builder.setArea(250.0);
    }
}