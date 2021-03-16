package com.company;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area() {
        this.candyBag = new CandyBag(3);
        this.candyBag.addBox(new Merci("milk", "Romania", 2));
        this.candyBag.addBox(new Lindt("orange", "Costa Rica", 3, 1, 2));
        this.candyBag.addBox(new Milka("banana", "UK", 3, 4));

        this.number = 660;
        this.street = "Splaiul Independentei";
    }

    public Area(CandyBag candyBag, int number, String street){
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void printAddress() {
        System.out.println("Address: " + this.street + ", " + this.number);
        CandyBox[] boxes = this.candyBag.getBoxes();

        int i;
        for (i = 0; i < this.candyBag.getCurrentLength();i++) {
            System.out.println(boxes[i].toString());
        }
    }
}
