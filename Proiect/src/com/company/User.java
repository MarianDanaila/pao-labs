package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User extends Human {
    Random rand = new Random(); // to generate random id;
    private final int userId = rand.nextInt(1000);
    Address userAddress;
    private ArrayList<Order> orders;

    public User(String firstName, String middleName, String lastName, int age, Address userAddress) {
        super(firstName, middleName, lastName, age);
        this.userAddress = userAddress;
        this.orders = new ArrayList<Order>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of User",formatter.format(date));
    }

    public User(String firstName, String middleName, String lastName, int age) {
        super(firstName, middleName, lastName, age);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of User",formatter.format(date));
    }

    public int getUserId() {
        return userId;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        var userName = this.firstName + " " + this.middleName + " " + this.lastName;
        return userName + " with the address: " + userAddress;
    }
}
