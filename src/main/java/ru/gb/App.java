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
                new HotDrink("Cacao", 110.00, 0.5, 70),
                new HotDrink("Coffee", 110.00, 0.3, 80),
                new Product("Cacao", 110.00),
                new Drink("Coffee", 90.00, 0.3)
        ));

        VendingMachine machine = new HotDrinkMachine(hotDrinks);
        System.out.println(machine.getProductByParam("Cacao", 110.00, 70));
    }
}
