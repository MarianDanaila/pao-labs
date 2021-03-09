package com.company;

public class Subject {
    // Attributes

    Room room;
    int noOfStudents;
    Person teacher;

    // Constructor

    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    // Getters & Setters


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    // toString

    @Override
    public String toString() {
        return "Subject{" +
                "room=" + room +
                ", noOfStudents=" + noOfStudents +
                ", teacher=" + teacher +
                '}';
    }
}
