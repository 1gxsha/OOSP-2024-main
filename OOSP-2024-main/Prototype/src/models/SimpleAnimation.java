package models;

public class SimpleAnimation extends Animation {

    public SimpleAnimation() {
        this.name = "Simple Animation";
        this.duration = 10;
    }

    public SimpleAnimation(String name, int duration) {
        super(name, duration);
    }

    public SimpleAnimation(SimpleAnimation simpleAnimation) {
        super(simpleAnimation);
    }

    @Override
    public Animation clone() {
        return new SimpleAnimation(this);
    }
}