package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }


    @Override
    public String toString() {
        return "Singer{" +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}' +
                "bandName='" + bandName + '\'';
    }

    public void sing() {
        System.out.println("can sing");
    }

    public void playguitar() {
        System.out.println("can play the guitar");
    }

}
