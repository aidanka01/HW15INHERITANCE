package com.company;

public class Programmer  extends Person{

    private String companyName;
    public Programmer (){

    }
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }



//    @Override
//    public String toString() {
//        return "Programmer{" +
//                ", name='" + name + '\'' +
//                ", designation='" + designation + '\'' +
//                "companyName='" + companyName + '\'' +
//                '}';
//    }

    public void coding() {
        System.out.println("can code in Java");
    }
}

