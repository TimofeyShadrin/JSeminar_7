package ru.gb;

public class HotDrink extends Drink{

    private final Integer temp;

    public HotDrink(String name, Double cost, Double volume, Integer temp) {
        super(name, cost, volume);
        this.temp = temp;
    }


    public Integer getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", volume=" + super.getVolume() +
                ", temp=" + temp +
                '}';
    }
}
