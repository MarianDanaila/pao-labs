package com.company;

import java.util.ArrayList;

public class DriverService {
    private ArrayList<Driver> drivers;

    public DriverService() {
        this.drivers = new ArrayList<Driver>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {drivers.remove(driver);}

    public void displayDrivers() {
        System.out.println("These are the drivers: ");
        for(var driver : this.drivers) {
            System.out.println(driver.toString());
        }
    }
}
