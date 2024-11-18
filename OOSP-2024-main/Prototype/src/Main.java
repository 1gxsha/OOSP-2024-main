import models.SimpleAnimation;

public class Main {
    public static void main(String[] args) {
        SimpleAnimation animation1 = new SimpleAnimation("Walk Cycle", 15);

        System.out.println("Original Animation: " + animation1);

        SimpleAnimation clonedAnimation = (SimpleAnimation) animation1.clone();
        System.out.println("Cloned Animation: " + clonedAnimation);

        clonedAnimation.name = "Run Cycle";
        clonedAnimation.duration = 10;

        System.out.println("Modified Cloned Animation: " + clonedAnimation);
        System.out.println("Original Animation after Clone Modification: " + animation1);
    }
}