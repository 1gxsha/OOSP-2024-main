package models;

public class DoorLock extends HomeDevice {
    public DoorLock(String deviceName) {
        super(deviceName);
    }

    @Override
    protected void performAction() {
        System.out.println("Door Lock " + deviceName + " is now locked.");
    }
}