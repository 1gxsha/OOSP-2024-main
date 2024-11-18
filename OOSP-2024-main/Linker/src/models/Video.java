package models;

public class Video implements VideoComponent {
    private String name;

    public Video(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Video: " + name);
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                '}';
    }
}