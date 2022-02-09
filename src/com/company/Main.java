package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Adilet"," Peaksoft");
        Programmer programmer = new Programmer("Asko", " programmer", " Peaksoft");
        Dancer dancer = new Dancer("Asylay", " dancer", " SHOK!");
        Singer singer = new Singer("Bakyt", " singer"," WOOD!");

        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();

        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
    }
}
