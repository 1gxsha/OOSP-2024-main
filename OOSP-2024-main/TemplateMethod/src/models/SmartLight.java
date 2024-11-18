package models;

public class SmartLight extends HomeDevice {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    protected void performAction() {
        System.out.println("Smart Light " + deviceName + " is turned on.");
    }
}