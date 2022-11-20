package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getAnonymousLogger();
        List<Product> hotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", 90.00, 0.2, 80),
                new HotDrink("Tea", 60.00, 0.3, 90),
                new HotDrink("Cocoa", 110.00, 0.5, 70),
                new HotDrink("Coffee", 110.00, 0.3, 80),
                new HotDrink("Coffee", 90.00, 0.25, 80),
                new Product("Cocoa", 110.00),
                new Drink("Coffee", 90.00, 0.3),
                new Product("Coffee", 90.00)
        ));

        VendingMachine machine = new HotDrinkMachine(hotDrinks);

        String resultID = String.valueOf(machine.getProductByParam(3, 110.00, 70));
        logger.info(resultID);

        String resultName = String.valueOf(machine.getProductByParam("Coffee", 90.00, 80));
        logger.info(resultName);
    }
}
