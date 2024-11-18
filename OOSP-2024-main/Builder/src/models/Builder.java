package models;

public interface Builder {
    void reset();
    void setType(String type);
    void setFloors(int floors);
    void setMaterial(String material);
    void setArea(double area);
}