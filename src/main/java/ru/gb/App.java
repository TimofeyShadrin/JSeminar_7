package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Product> hotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", 90.00, 0.2, 80),
                new HotDrink("Tea", 60.00, 0.3, 90),
                new HotDrink("Cocoa", 110.00, 0.5, 70),
                new HotDrink("Coffee", 110.00, 0.3, 80),
                new Product("Cocoa", 110.00),
                new Drink("Coffee", 90.00, 0.3)
        ));

        VendingMachine machine = new HotDrinkMachine(hotDrinks);

        String resultID = String.valueOf(machine.getProductByParam(3, 110.00, 70));
        System.out.println(resultID);

        String resultName = String.valueOf(machine.getProductByParam("Tea", 60.00, 90));
        System.out.println(resultName);
    }
}
