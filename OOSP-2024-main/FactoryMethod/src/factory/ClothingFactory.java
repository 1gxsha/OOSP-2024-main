package factory;

import models.Clothing;
import models.Product;

public class ClothingFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Clothing(name, price);
    }
}