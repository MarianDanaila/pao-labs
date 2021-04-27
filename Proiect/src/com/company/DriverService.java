package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverService {
    private Driver[] drivers = null;
    static final private int MAX_DRIVERS = 10;
    public DriverService() {

    }

    public void addDriver(Driver driver) {
        if(this.drivers == null) {
            this.drivers = new Driver[]{driver};
        }
        else {
            if(this.drivers.length == MAX_DRIVERS) {
                System.out.println("Capacity reached.");
                return;
            }
            this.drivers = Arrays.copyOf(this.drivers, this.drivers.length+1);
            this.drivers[this.drivers.length-1] = driver;
        }
    }

    public void displayDrivers() {
        Arrays.sort(this.drivers);
        System.out.println("These are the drivers: ");
        for (Driver driver : this.drivers) {
            System.out.println(driver.toString());
        }
    }
}
