package com.company;

public class Merci extends CandyBox {
    private float length;

    public Merci() {
        super();
        this.length = 1f;
    }

    public Merci(String flavor, String origin, float length) {
        super(flavor, origin);
    }

    @Override
    public float getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.flavor + "has volume" + this.getVolume();
    }

}
