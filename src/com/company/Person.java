package com.company;

public class Person {
    String name;
    String designation;

    public Person(){

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn(){
        System.out.println( name + " is walking");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}





