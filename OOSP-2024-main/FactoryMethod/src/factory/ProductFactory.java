package factory;

import models.Product;

public interface ProductFactory {
    Product createProduct(String name, double price);
}