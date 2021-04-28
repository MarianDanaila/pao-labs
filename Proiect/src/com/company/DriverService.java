package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DriverService {
    private Driver[] drivers = null;
    static final private int MAX_DRIVERS = 10;
    public Comparable<Driver>[] readCSV(String path){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Driver driver = new Driver(values[0], values[1], values[2], Integer.parseInt(values[3]), Boolean.parseBoolean(values[4]));
                System.out.println(driver);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return drivers;
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
                csvWriter.append("FirstName,MiddleName,LastName,Age,Availability");
                csvWriter.append("\n");
            }


            for (Driver d :
                    drivers) {
                csvWriter.append(d.firstName);
                csvWriter.append(",");
                csvWriter.append(d.middleName);
                csvWriter.append(",");
                csvWriter.append(d.lastName);
                csvWriter.append(",");
                csvWriter.append(String.valueOf(d.age));
                csvWriter.append(",");
                csvWriter.append(String.valueOf(d.availability));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
