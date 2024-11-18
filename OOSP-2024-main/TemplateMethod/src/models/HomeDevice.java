package models;

abstract public class HomeDevice {
    protected String deviceName;

    public HomeDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    // Template method
    public final void controlDevice() {
        performAction();
    }

    // Abstract method to be implemented by subclasses
    protected abstract void performAction();
}