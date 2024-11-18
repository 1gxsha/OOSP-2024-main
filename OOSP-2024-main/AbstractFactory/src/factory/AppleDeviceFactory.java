package factory;

import devices.AppleSmartphone;
import devices.AppleTablet;
import devices.AppleLaptop;
import devices.Smartphone;
import devices.Tablet;
import devices.Laptop;

public class AppleDeviceFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    public Tablet createTablet() {
        return new AppleTablet();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}