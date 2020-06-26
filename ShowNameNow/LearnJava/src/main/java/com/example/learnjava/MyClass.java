package com.example.learnjava;

import java.io.Serializable;
import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {


        // Array Lists
        ArrayList<java.io.Serializable> name = new ArrayList<>();

        name.add(1);
        name.add("Hello");
        System.out.println(name);

        for (Serializable names : name) {
            System.out.println(name);
        }

//
//        int[] myArray = {1, 33, 4, 12};
//        System.out.println(myArray[3]);
//
//        String[] names = {"Casey", "Anthony", "Franklin", "Bob"};
//        System.out.println(names[0]);
//
//        int[] newArray = new int[10];
//        String[] newNames = new String[5];
//
//        newArray[0] = 12;
//        newArray[1] = 13;
//
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Items: " + names[i]);
//        }



////      Person casey = new Person();
//        Person casey = new Person("Casey", "Miller", 28);
//
//        System.out.println(casey.getAge());
//
//        Employee employee = new Employee();
//
//        employee.setAge(23);
//        System.out.println(employee.getAge());
//
//        Manager manager = new Manager();
//        manager.setFirstName("Jason");
//        manager.setLastName("Watkins");
//        manager.setAnnualSalary(45000);
//        System.out.println(manager.getAnnualSalary());
//        System.out.println(manager.toString());
















       /*
        // Variable is a bucket in memory
        String name = "Casey";
        // Integers
        int age = 23;
        // Running out of space: long
        long weightOfPlanet = 1233127932;
        // Another option: float
        float pi = 3.14159265f;
        byte b = 127; // 127 max
        short s = 151; // 2x byte
        char a = 'j';

        // Boolean is true or false, 1, 0

        boolean isTrue = true;


        double pi_d = 3.14159265; // provides more precision
//        System.out.println("My name is " + name + " and I am " + age + " years old.");
//        System.out.println(age);
//        System.out.println("My name is Casey!");


        */

       /*
       // addition
        int a = 12;
        int b = 12;
        int total = b + a;
        System.out.println(a + " + " + b + " = " + total);

        // subtraction
        int total_sub = a - b;
        System.out.println(a + " - " + b + " = " + total_sub);

        // multiplication
        int total_mult = a * b;
        System.out.println(a + " * " + b + " = " + total_mult);

        // division
        int total_div = a / b;
        System.out.println(a + " / " + b + " = " + total_div);

        // remainders
        double a1 = 15;
        double b1 = 7;
        System.out.println(b1%a1);

        */

       /*
       // Control Flow

        int a = 10;
        int b = 12;

        if (a == b ) {
            System.out.println("Yay!");
        }
        else {
            System.out.println("Also Yay!");
        }

        */
/*
        Microphone mic = new Microphone("Red", "Red mic", 1);
//        mic.color = "Red";
//        mic.name = "Red mic";
//        mic.model = 1;
//        System.out.println(mic.color.toString());

        Microphone otherMic = new Microphone("Purple", "Purple mic", 1);
        otherMic.setColor("Blue");
//        otherMic.name = "Purple mic";
//        otherMic.model = 1;
        otherMic.turnOn();
        otherMic.setVolume();
        otherMic.turnOff();
        System.out.println(otherMic.showDescription());

        otherMic.setColor("Other Mic");

 */

    }
}