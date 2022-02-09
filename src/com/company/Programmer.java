package com.company;

public class Programmer extends Person {
    String companyName;

    public Programmer(){

    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println(name + " is coding");

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

