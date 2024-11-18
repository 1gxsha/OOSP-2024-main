package models;

import java.util.ArrayList;
import java.util.List;

public class Folder implements VideoComponent {
    private String name;
    private List<VideoComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(VideoComponent component) {
        components.add(component);
    }

    public void removeComponent(VideoComponent component) {
        components.remove(component);
    }

    public void removeComponent(int index) {
        components.remove(index);
    }

    @Override
    public void print() {
        System.out.println("Folder: " + name);
        for (VideoComponent component : components) {
            component.print();
        }
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}