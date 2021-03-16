package com.company;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
        super();
        this.length = 1f;
        this.height = 1f;
        this.width = 1f;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        return this.length * this.height * this.width;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.flavor + "has volume" + this.getVolume();
    }
}
