package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Restaurant {
    Random rand = new Random(); // to generate random id;
    private final int restaurantId = rand.nextInt(1000);
    private String name;
    private Address address;
    private ArrayList<Menu> menus;
    private ArrayList<Review> reviews;

    public Restaurant(String name, Address address) {
        this.name = name;
        this.address = address;
        this.menus = new ArrayList<Menu>();
        this.reviews = new ArrayList<Review>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Restaurant",formatter.format(date));
    }

    public int getRestaurantId() { return restaurantId; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant: '" + name + "' with the following address: " + address;
    }
}
