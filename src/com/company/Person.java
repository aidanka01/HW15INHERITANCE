package com.company;

public abstract class Person {
    public String name;
    public String designation;

    public Person() {

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("can learn");
    }

    public void walk() {
        System.out.println(" can walk");
    }

    public void eat() {
        System.out.println("can eat");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}


