package factory;

import models.Footwear;
import models.Product;

public class FootwearFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Footwear(name, price);
    }
}