package ru.gb;

import java.util.List;

public abstract class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductByName (String name) {
        for (Product item: this.products) {
            if (name.equals(item.getName())) return item;
        }
        throw new IllegalStateException("Product not found");
    }

    public abstract Product getProductByParam (String name, Double cost, Integer temp);
}
