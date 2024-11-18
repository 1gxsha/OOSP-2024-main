import models.Android;
import models.Device;
import models.HarmonyOS;
import models.IOS;
import models.Smartphone;
import models.Tablet;

public class Main {
    public static void main(String[] args) {
        Device smartphoneIOS = new Smartphone(new IOS());
        System.out.println(smartphoneIOS.work());

        Device smartphoneAndroid = new Smartphone(new Android());
        System.out.println(smartphoneAndroid.work());

        Device tabletHarmonyOS = new Tablet(new HarmonyOS());
        System.out.println(tabletHarmonyOS.work());
    }
}