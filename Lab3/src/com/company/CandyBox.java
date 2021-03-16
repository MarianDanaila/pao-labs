package com.company;

public abstract class CandyBox {
    protected String flavor;
    protected String origin;

    public CandyBox() {
        this.flavor = "flavor1";
        this.origin = "origin1";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public abstract float getVolume();

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + this.flavor + '\'' +
                ", origin='" + this.origin + '\'' +
                '}';
    }
}
