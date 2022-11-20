package ru.gb;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private final String name;
    private final Double cost;
    static AtomicInteger nextId = new AtomicInteger(0);
    private final int id;

    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
        this.id = nextId.incrementAndGet();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
