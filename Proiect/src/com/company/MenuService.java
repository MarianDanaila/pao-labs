package com.company;

import java.util.ArrayList;

public class MenuService {
    private ArrayList<Menu> menus;

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
