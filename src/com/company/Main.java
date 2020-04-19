package com.company;

class Animal {


}

class Student {

    private String name;
    private int rollNo;
    private String ID_NO;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getID_NO() {
        return name + String.valueOf(rollNo);
    }
}


class Vehicle{

    int color ;
    int tyre ;
    String model ;
    int company ;
    String engine ;

    public String getModel(){
        return model;
    }

}




class Car extends Vehicle{

    @Override
    public String getModel() {
        return super.getModel() + engine;
    }
}

class Truck{

    int color ;
    int tyre ;
    int model ;
    int company ;
    int engine ;

}


public class Main {


    // Primitive types
    // int , double, float, char, long, short, byte, string

    int rollNumber = 7;


    // Control Flows (If-else, switch statement, loops,)

    //Loops (for, while, do-while, foreach)
    // If-else,  if-elseif-else,
    // switch statement

    //Statement vs expression
    int result = (1 + 5 - 3);


    // Arrays
    // Group of data, of same of type.
    //


    // List, ArrayList
    // we can define a list without specifying its size.


    // OOP (Object oriented programming)

    // Inheritance -
    // Polymorphism -
    // Abstraction -
    // Encapsulation -


    // Classes, interfaces




    public static void main(String[] args) {
        // write your code here

        Animal animal = new Animal();


        Student student = new Student();

        student.setName("Mehboob");
        student.setRollNo(12);
        student.getID_NO();

    }
}
