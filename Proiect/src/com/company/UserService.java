package com.company;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(User user) {users.remove(user);}

    public void displayUsers() {
        System.out.println("Here are the users:");
        for(var user : users) {
            System.out.println(user.toString());
        }
    }

    public void displayOrdersFromUser(int userId) {
        boolean found = false;
        for(var user : users) {
            if (user.getUserId() == userId) {
                found = true;
                for(var order : user.getOrders()) {
                    System.out.println(order.toString());
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void addOrder(Order order) {
        boolean found = false;
        for(var user : users) {
            if (user.getUserId() == order.getUserId()) {
                user.getOrders().add(order);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void addProduct(Product product, int orderId) {
        boolean found = false;
        for(var user : users) {
            for(var order : user.getOrders()) {
                if (order.getOrderId() == orderId) {
                    order.getProducts().add(product);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
