package com.company;

public class Main {

    public static void ex1() {
        Person pers1 = new Person("Danaila", "Marian", 20, 565656565, "1");
        Person pers2 = new Person("Marian", "Danaila", 21, 656565656, "2");
        System.out.println(pers1);
        System.out.println(pers2);
    }

    public static void ex2() {
        Room room1 = new Room(320, "Single", 3);
        Room room2 = new Room(220, "Double", 2);
        System.out.println(room1);
        System.out.println(room2);
    }

    public static void ex3() {
        Subject subj1 = new Subject(new Room(320, "Single", 3), 32,
                new Person("Danaila", "Marian", 20, 565656565, "1"));

        Subject subj2 = new Subject(new Room(220, "Double", 2), 30,
                new Person("Marian", "Danaila", 21, 656565656, "2"));

        System.out.println(subj1);
        System.out.println(subj2);
    };

    public static void main(String[] args) {
         ex1();
         ex2();
         ex3();
    }
}
