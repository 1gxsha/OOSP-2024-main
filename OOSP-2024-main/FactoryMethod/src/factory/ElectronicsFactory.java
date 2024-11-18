package factory;

import models.Electronics;
import models.Product;

public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Electronics(name, price);
    }
}