package models;

public class AirConditioner extends HomeDevice {
    public AirConditioner(String deviceName) {
        super(deviceName);
    }

    @Override
    protected void performAction() {
        System.out.println("Air Conditioner " + deviceName + " is cooling the room.");
    }
}