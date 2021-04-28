package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

public class RestaurantService {
    private ArrayList<Restaurant> restaurants;
    public ArrayList<Restaurant> readCSV(String path){
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String[] addr = values[1].split(" ");
                Address address = new Address(addr[0], addr[1], addr[2], Integer.parseInt(addr[3]));
                Restaurant restaurant = new Restaurant(values[0], address);
                System.out.println(restaurant);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return restaurants;
    }

    public void writeCSV(String path){
        File file = new File(path);
        boolean header=false;
        boolean result;
        try{
            result = file.createNewFile();
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
                header = true;
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileWriter csvWriter = new FileWriter(file,true);
            if (header){
                csvWriter.append("Name,Address,Menus,Reviews");
                csvWriter.append("\n");
            }


            for (Restaurant r :
                    restaurants) {
                csvWriter.append(r.getName());
                csvWriter.append(",");
                csvWriter.append(r.getAddress().toString());
                csvWriter.append(",");
                csvWriter.append(r.getMenus().toString());
                csvWriter.append(",");
                csvWriter.append(r.getReviews().toString());
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
