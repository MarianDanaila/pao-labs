package com.company;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver extends Human implements Comparable<Driver> {
    Random rand = new Random(); // to generate random id;
    private final int driverId = rand.nextInt(1000);
    protected boolean availability;

    public Driver(String firstName, String middleName, String lastName, int age, boolean availability) {
        super(firstName, middleName, lastName, age);
        this.availability = availability;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        AuditService audit = new AuditService();
        audit.writeCSV("new Instance of Driver",formatter.format(date));
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
    public int compareTo(Driver d) {
        int res = this.getLastName().compareTo(d.getLastName());
        if(res == 0){
            return this.getFirstName().compareTo(d.getFirstName());
        }
        return res;
    }

    @Override
    public String toString() {
        var driverName = this.firstName + " " + this.middleName + " " + this.lastName;
        return availability ? driverName + " is available" : driverName + " is not available";
    }
}
