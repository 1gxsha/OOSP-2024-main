package models;

public class Building {
    private String type;
    private int floors;
    private String material;
    private double area;

    public void setType(String type) {
        this.type = type;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                ", floors=" + floors +
                ", material='" + material + '\'' +
                ", area=" + area +
                '}';
    }
}