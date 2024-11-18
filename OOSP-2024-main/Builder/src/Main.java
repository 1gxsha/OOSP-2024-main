import models.Director;
import models.Building;
import models.BuildingBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BuildingBuilder buildingBuilder = new BuildingBuilder();

        director.constructSkyscraper(buildingBuilder);
        Building skyscraper = buildingBuilder.getBuilding();
        System.out.println("Constructed Building:\n" + skyscraper);

        director.constructHouse(buildingBuilder);
        Building house = buildingBuilder.getBuilding();
        System.out.println("Constructed Building:\n" + house);
    }
}