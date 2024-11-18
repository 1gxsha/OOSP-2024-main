package factory;

import devices.SamsungSmartphone;
import devices.SamsungTablet;
import devices.SamsungLaptop;
import devices.Smartphone;
import devices.Tablet;
import devices.Laptop;

public class SamsungDeviceFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }

    @Override
    public Tablet createTablet() {
        return new SamsungTablet();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}