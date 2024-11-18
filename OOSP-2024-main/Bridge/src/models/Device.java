package models;

abstract public class Device {
    protected MobileOS mobileOS;

    public Device(MobileOS mobileOS) {
        this.mobileOS = mobileOS;
    }

    public abstract String work();
}