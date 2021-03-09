package com.company;

public class Room {
    // Attributes

    int roomNr;
    String roomType;
    int roomFloor;


    // Constructors

    public Room(int roomNr, String roomType, int roomFloor) {
        this.roomNr = roomNr;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
    }

    // Getters & Setters

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    // toString

    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", roomType='" + roomType + '\'' +
                ", roomFloor=" + roomFloor +
                '}';
    }
}
