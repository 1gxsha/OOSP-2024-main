import factory.ClothingFactory;
import factory.ElectronicsFactory;
import factory.FootwearFactory;
import factory.ProductFactory;
import models.Product;

public class Main {
    public static void main(String[] args) {
        ProductFactory clothingFactory = new ClothingFactory();
        ProductFactory footwearFactory = new FootwearFactory();
        ProductFactory electronicsFactory = new ElectronicsFactory();

        Product shirt = clothingFactory.createProduct("T-Shirt", 19.99);
        Product sneakers = footwearFactory.createProduct("Sneakers", 49.99);
        Product laptop = electronicsFactory.createProduct("Laptop", 999.99);

        System.out.println("Ordered products:");
        System.out.println(shirt);
        System.out.println(sneakers);
        System.out.println(laptop);
    }
}