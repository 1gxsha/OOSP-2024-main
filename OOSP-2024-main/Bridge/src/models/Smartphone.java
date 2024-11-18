package models;

public class Smartphone extends Device {
    public Smartphone(MobileOS mobileOS) {
        super(mobileOS);
    }

    @Override
    public String work() {
        return "Smartphone is " + mobileOS.operate();
    }
}