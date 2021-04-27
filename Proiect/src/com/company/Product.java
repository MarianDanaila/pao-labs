package com.company;

import java.util.Random;

public class Product {
    Random rand = new Random(); // to generate random id;
    private final int productId = rand.nextInt(1000);
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + name +
                " with price = " + price;
    }
}
