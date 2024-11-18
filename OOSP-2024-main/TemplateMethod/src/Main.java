import models.SmartLight;
import models.AirConditioner;
import models.DoorLock;
import models.HomeDevice;

public class Main {
    public static void main(String[] args) {
        HomeDevice light = new SmartLight("LivingRoomLight");
        HomeDevice airConditioner = new AirConditioner("BedroomAC");
        HomeDevice doorLock = new DoorLock("FrontDoorLock");

        light.controlDevice();
        airConditioner.controlDevice();
        doorLock.controlDevice();
    }
}