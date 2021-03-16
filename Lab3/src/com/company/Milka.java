package com.company;

public class Milka extends CandyBox {
    private float radius;
    private float height;

    public Milka() {
        super();
        this.radius = 1f;
        this.height = 1f;
    }

    public Milka(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return this.radius * this.radius * (float)Math.PI * this.height;

    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.flavor + "has volume" + this.getVolume();
    }
}
