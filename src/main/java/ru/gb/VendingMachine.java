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

    public abstract <Name, Cost, Temp> List<Product> getProductByParam (Name nameOrID, Cost cost, Temp temp);
}
