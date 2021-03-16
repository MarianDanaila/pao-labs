package com.company;

public class CandyBag {
    private CandyBox[] boxes;
    private int totalLength;
    private int currentLength;

    public CandyBag() {
        this.boxes = new CandyBox[100];
        this.totalLength = 10;
    }

    public CandyBag(int length) {
        this.boxes = new CandyBox[length];
        this.totalLength = length;
    }

    public void addBox(CandyBox box) {
        if(this.currentLength < this.totalLength) {
            this.boxes[currentLength] = box;
            currentLength++;
        }
        else {
            System.out.println("Too many boxes");
        }
    }

    public CandyBox[] getBoxes() {
        return boxes;
    }

    public void setBoxes(CandyBox[] boxes) {
        this.boxes = boxes;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public void setCurrentLength(int currentLength) {
        this.currentLength = currentLength;
    }
}
