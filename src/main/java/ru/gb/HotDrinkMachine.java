package ru.gb;

import java.util.List;

public class HotDrinkMachine extends VendingMachine {

    public HotDrinkMachine(List<Product> products) {
        super(products);
    }

    @Override
    public Product getProductByParam (String name, Double cost, Integer temp) {
        for (Product item : super.getProducts()) {
            if (name.equals(item.getName()) &&
            cost.equals(item.getCost()) &&
            temp.equals(((HotDrink)(item)).getTemp()))
                return item;
        }
        throw new IllegalStateException("Product not found!");
    }
}
