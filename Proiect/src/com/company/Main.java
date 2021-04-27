package com.company;

public class Main {

    public static void main(String[] args) {
        // Services
        RestaurantService rs = new RestaurantService();
        UserService us = new UserService();
        DriverService ds = new DriverService();
        MenuService ms = new MenuService();


        Restaurant rest1 = new Restaurant("Godai",
                        new Address("Romania", "Bucharest", "Splaiul Independentei",
                                204));

        Restaurant rest2 = new Restaurant("Pizza4You",
                new Address("Romania", "Galati", "Suhurlui", 123));
        Product prod1 = new Product("Pizza Diavola", 35);
        Product prod2 = new Product("Pizza MAX", 66);

        rs.addRestaurant(rest1);
        rs.addRestaurant(rest2);
        rs.displayRestaurants();
        //rs.removeRestaurant(rest1);
        //rs.displayRestaurants();

        User user1 = new User("Marian", "", "Danaila", 20,
                new Address("Romania", "Bucharest", "Bulevardul Aviatorilor",
                        12));

        User user2 = new User("Vlad", "Cristian", "Marcu", 21,
                new Address("Romania", "Bucharest", "Calea Mosilor",
                        7));


        us.addUser(user1);
        us.addUser(user2);
        us.displayUsers();
        //us.removeUser(user1);
        //us.displayUsers();


        Driver driver1 = new Driver("Valtteri", "Viktor", "Bottas", 31, true);
        Driver driver2 = new Driver("Robert", "", "Visoiu", 25, false);

        ds.addDriver(driver1);
        ds.addDriver(driver2);
        ds.displayDrivers();
        ds.removeDriver(driver1);
        ds.displayDrivers();


        Review review1 = new Review(user1.getUserId(), rest2.getRestaurantId(), 3, "Disgusting food");
        rs.addReview(review1);
        rs.displayReviewsFromRestaurant(rest2.getRestaurantId());


        Order order1 = new Order(user1.getUserId(), "Order1");
        Order order2 = new Order(user2.getUserId(), "Order2");
        us.addOrder(order1);
        us.addOrder(order2);
        us.addProduct(prod1, order1.getOrderId());
        us.addProduct(prod2, order2.getOrderId());
        us.displayOrdersFromUser(user2.getUserId());


        Menu menu1 = new Menu("Lunch");
        ms.addMenu(menu1);
        ms.addProduct(prod1, menu1.getMenuId());
        ms.displayProducts(menu1.getMenuId());


        rs.addMenuToRestaurant(menu1, rest2.getRestaurantId());
        rs.displayMenus(rest2.getRestaurantId());


    }
}
