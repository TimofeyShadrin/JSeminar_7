package ru.gb;

import java.util.List;

public class HotDrinkMachine extends VendingMachine {

    public HotDrinkMachine(List<Product> products) {
        super(products);
    }

    @Override
    public <Name, Cost, Temp> Product getProductByParam (Name nameOrID, Cost cost, Temp temp) {
        String type = nameOrID.getClass().getSimpleName();
        if (type.equals("String")) {
            for (Product item : super.getProducts()) {
                if (nameOrID.equals(item.getName()) &&
                        cost.equals(item.getCost()) &&
                        temp.equals(((HotDrink) (item)).getTemp()))
                    return item;
            }
        } else if (type.equals("Integer")) {
            for (Product item : super.getProducts()) {
                if (nameOrID.equals(item.getId()) &&
                        cost.equals(item.getCost()) &&
                        temp.equals(((HotDrink) (item)).getTemp()))
                    return item;
            }
        }
        throw new IllegalStateException("Product not found!");
    }
}
