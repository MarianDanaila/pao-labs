package com.company;

import java.io.*;
import java.util.ArrayList;

public class MenuService {
    private ArrayList<Menu> menus;
    public ArrayList<Menu> readCSV(String path){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Menu menu = new Menu(values[0]);
                System.out.println(menu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return menus;
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
                csvWriter.append("MenuName,Products");
                csvWriter.append("\n");
            }


            for (Menu m :
                    menus) {
                csvWriter.append(m.getMenuName());
                csvWriter.append(",");
                csvWriter.append(m.getProducts().toString());
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MenuService() {
        this.menus = new ArrayList<Menu>();
    }
    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void addProduct(Product product, int menuId) {
        boolean found = false;
        for(var menu : menus) {
            if (menu.getMenuId() == menuId) {
                menu.getProducts().add(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void displayProducts(int menuId) {
        boolean found = false;
        for(var menu : menus) {
            if (menu.getMenuId() == menuId) {
                found = true;
                for(var prod : menu.getProducts()) {
                    System.out.println(prod.toString());
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }


}
