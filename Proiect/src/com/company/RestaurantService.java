package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class RestaurantService {
    private ArrayList<Restaurant> restaurants;

    public RestaurantService() {
        this.restaurants = new ArrayList<Restaurant>();
    }

    public void addRestaurant(Restaurant rest) {
        restaurants.add(rest);
    }
    public void removeRestaurant(Restaurant rest) {restaurants.remove(rest);}

    public void displayRestaurants() {
        System.out.println("These are the restaurants:");
        for(var rest : restaurants) {
            System.out.println(rest.toString());
        }
    }


    public void addReview(Review review) {
        boolean found = false;
        for(var rest : restaurants) {
            if (rest.getRestaurantId() == review.getRestaurantId()) {
                rest.getReviews().add(review);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void displayReviewsFromRestaurant(int restaurantId) {
        boolean found = false;
        for(var rest : restaurants) {
            if (rest.getRestaurantId() == restaurantId) {
                found = true;
                for(var review : rest.getReviews()) {
                    System.out.println(review.toString());
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void addMenuToRestaurant(Menu menu, int restaurantId) {
        boolean found = false;
        for(var rest : restaurants) {
            if (rest.getRestaurantId() == restaurantId) {
                rest.getMenus().add(menu);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void displayMenus(int restaurantId) {
        boolean found = false;
        for(var rest : restaurants) {
            if (rest.getRestaurantId() == restaurantId) {
                found = true;
                for(var menu : rest.getMenus()) {
                    System.out.println(menu.toString());
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

}
