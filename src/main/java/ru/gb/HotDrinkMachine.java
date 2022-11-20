package ru.gb;

import java.util.List;
import java.util.stream.Collectors;

public class HotDrinkMachine extends VendingMachine {

    public HotDrinkMachine(List<Product> products) {
        super(products);
    }

    @Override
    public <Name> List<Product> getProductByParam(Name nameOrID, Double cost, Integer temp) {
        List<Product> hotDrink = getProducts().stream()
                .filter(item -> (item.getClass().getSimpleName()).equals("HotDrink"))
                .collect(Collectors.toList());
        String type = nameOrID.getClass().getSimpleName();
        if (type.equals("String")) {
            return hotDrink.stream()
                    .filter(item -> nameOrID.equals(item.getName()) &&
                        cost.equals(item.getCost()) &&
                        temp.equals(((HotDrink) (item)).getTemp()))
                    .collect(Collectors.toList());
            } else if (type.equals("Integer")) {
            return hotDrink.stream()
                    .filter(item -> nameOrID.equals(item.getId()) &&
                            cost.equals(item.getCost()) &&
                            temp.equals(((HotDrink) (item)).getTemp()))
                    .collect(Collectors.toList());
        }
        throw new IllegalStateException("Product not found!");
    }
}
