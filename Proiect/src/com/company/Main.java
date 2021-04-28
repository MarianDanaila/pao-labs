package com.company;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        // Services
        RestaurantService rs = new RestaurantService();
        UserService us = new UserService();
        DriverService ds = new DriverService();
        MenuService ms = new MenuService();


        Restaurant rest1 = new Restaurant("Godai",
                        new Address("Romania", "Bucharest", "Independentei",
                                204));

        Restaurant rest2 = new Restaurant("Pizza4You",
                new Address("Romania", "Galati", "Suhurlui", 123));
        Product prod1 = new Product("Pizza Diavola", 35);
        Product prod2 = new Product("Pizza MAX", 66);

        rs.addRestaurant(rest1);
        rs.addRestaurant(rest2);


        User user1 = new User("Marian", "Alex", "Danaila", 20,
                new Address("Romania", "Bucharest", "Aviatorilor",
                        12));

        us.addUser(user1);
        us.writeCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Users.csv");
        us.readCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Users.csv");



        //us.displayUsers();
        //us.removeUser(user1);
        //us.displayUsers();


        Driver driver1 = new Driver("Valtteri", "Viktor", "Bottas", 31, true);
        Driver driver2 = new Driver("Robert", "JR", "Visoiu", 25, false);

        ds.addDriver(driver1);
        ds.addDriver(driver2);
        ds.writeCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Drivers.csv");
        ds.readCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Drivers.csv");
        ds.displayDrivers();


        Review review1 = new Review(user1.getUserId(), rest2.getRestaurantId(), 3, "Disgusting food");
        Review review2 = new Review(user1.getUserId(), rest1.getRestaurantId(), 6, "Good food");
        rs.addReview(review1);
        rs.addReview(review2);
        //rs.displayReviewsFromRestaurant(rest1.getRestaurantId());


        //Order order1 = new Order(user1.getUserId(), "Order1");
        //Order order2 = new Order(user2.getUserId(), "Order2");
        //us.addOrder(order1);
        //us.addOrder(order2);
        //us.addProduct(prod1, order1.getOrderId());
        //us.addProduct(prod2, order2.getOrderId());
        //us.displayOrdersFromUser(user2.getUserId());


        Menu menu1 = new Menu("Lunch");
        Menu menu2 = new Menu("Dinner");
        ms.addMenu(menu1);
        ms.addMenu(menu2);
        ms.addProduct(prod1, menu1.getMenuId());
        ms.addProduct(prod2, menu2.getMenuId());

        rs.addMenuToRestaurant(menu1, rest2.getRestaurantId());
        rs.addMenuToRestaurant(menu2, rest1.getRestaurantId());
        //rs.displayMenus(rest2.getRestaurantId());
        ms.writeCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Menu.csv");
        ms.readCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Menu.csv");
        //ms.displayProducts(menu1.getMenuId());

        rs.writeCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Restaurants.csv");
        rs.readCSV("/home/danailamarian/Desktop/University/Second/Second/ProgrAvOb/Lab/Proiect/csv/Restaurants.csv");
        //rs.displayRestaurants();
    }
}
