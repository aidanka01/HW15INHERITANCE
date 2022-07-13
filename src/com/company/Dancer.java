package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                "groupName='" + groupName + '\'' +
                '}';
    }

    public  void dance() {
        System.out.println("can dance ballet");
    }


}

