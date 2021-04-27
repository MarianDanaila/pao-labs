package com.company;

import java.util.Random;

public class Driver extends Human {
    Random rand = new Random(); // to generate random id;
    private final int driverId = rand.nextInt(1000);
    private boolean availability;

    public Driver(String firstName, String middleName, String lastName, int age, boolean availability) {
        super(firstName, middleName, lastName, age);
        this.availability = availability;
    }

    public int getDriverId() {
        return driverId;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        var driverName = this.firstName + " " + this.middleName + " " + this.lastName;
        return availability ? driverName + " is available" : driverName + " is not available";
    }
}
