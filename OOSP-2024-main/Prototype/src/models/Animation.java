package models;

abstract class Animation implements Cloneable {
    protected String name;
    protected int duration;

    public Animation() {
    }

    public Animation(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public Animation(Animation animation) {
        this.name = animation.name;
        this.duration = animation.duration;
    }

    public abstract Animation clone();

    @Override
    public String toString() {
        return "Animation{name='" + name + "', duration=" + duration + " seconds}";
    }
}