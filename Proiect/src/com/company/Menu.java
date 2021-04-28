package com.company;

import java.util.Random;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {
    Random rand = new Random(); // to generate random id;
    private final int menuId = rand.nextInt(1000);
    private ArrayList<Product> products;
    private String menuName;

    public Menu(String menuName) {
        this.products = new ArrayList<Product>();
        this.menuName = menuName;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Menu",formatter.format(date));
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
        return menuName;
    }
}
