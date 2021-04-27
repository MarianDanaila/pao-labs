package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Order {
    Random rand = new Random(); // to generate random id;
    private final int orderId = rand.nextInt(1000);
    private final int userId;
    private String orderName;
    private ArrayList<Product> products;

    public Order(int userId, String orderName) {
        this.userId = userId;
        this.orderName = orderName;
        this.products = new ArrayList<Product>();
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder productsString = new StringBuilder();
        for(var prod : getProducts()) {
            productsString.append(prod);
        }
        if (productsString.toString().equals("")) {
            return "Order " + orderName + " doesn't have products";
        }
        return "Order " + orderName + "' has following products: " + productsString;
    }
}
