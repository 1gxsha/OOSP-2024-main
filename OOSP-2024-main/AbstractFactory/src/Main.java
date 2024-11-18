import factory.DeviceFactory;
import factory.AppleDeviceFactory;
import factory.SamsungDeviceFactory;
import devices.Smartphone;
import devices.Tablet;
import devices.Laptop;

public class Main {
    public static void main(String[] args) {
        DeviceFactory appleFactory = new AppleDeviceFactory();
        Smartphone appleSmartphone = appleFactory.createSmartphone();
        Tablet appleTablet = appleFactory.createTablet();
        Laptop appleLaptop = appleFactory.createLaptop();

        System.out.println(appleSmartphone.use());
        System.out.println(appleTablet.use());
        System.out.println(appleLaptop.use());

        DeviceFactory samsungFactory = new SamsungDeviceFactory();
        Smartphone samsungSmartphone = samsungFactory.createSmartphone();
        Tablet samsungTablet = samsungFactory.createTablet();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        System.out.println(samsungSmartphone.use());
        System.out.println(samsungTablet.use());
        System.out.println(samsungLaptop.use());
    }
}