package com.company;

import java.io.*;
import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;
    public ArrayList<User> readCSV(String path){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                User user = new User(values[0],values[1],values[2],Integer.parseInt(values[3]));
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
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
                csvWriter.append("FirstName,MiddleName,LastName,age");
                csvWriter.append("\n");
            }


            for (User u :
                    users) {
                csvWriter.append(u.firstName);
                csvWriter.append(",");
                csvWriter.append(u.middleName);
                csvWriter.append(",");
                csvWriter.append(u.lastName);
                csvWriter.append(",");
                csvWriter.append(String.valueOf(u.age));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
