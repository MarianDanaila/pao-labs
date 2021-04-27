package com.company;

import java.util.Random;
import java.util.ArrayList;

public class Menu {
    Random rand = new Random(); // to generate random id;
    private final int menuId = rand.nextInt(1000);
    private ArrayList<Product> products;
    private String menuName;

    public Menu(String menuName) {
        this.products = new ArrayList<Product>();
        this.menuName = menuName;
    }

    public int getMenuId() {
        return menuId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                '}';
    }
}
