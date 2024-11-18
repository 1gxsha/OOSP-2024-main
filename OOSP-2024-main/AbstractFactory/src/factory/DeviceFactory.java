package factory;

import devices.Smartphone;
import devices.Tablet;
import devices.Laptop;

public interface DeviceFactory {
    Smartphone createSmartphone();
    Tablet createTablet();
    Laptop createLaptop();
}