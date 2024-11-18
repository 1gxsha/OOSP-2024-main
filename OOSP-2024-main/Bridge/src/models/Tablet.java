package models;

public class Tablet extends Device {
    public Tablet(MobileOS mobileOS) {
        super(mobileOS);
    }

    @Override
    public String work() {
        return "Tablet is " + mobileOS.operate();
    }
}