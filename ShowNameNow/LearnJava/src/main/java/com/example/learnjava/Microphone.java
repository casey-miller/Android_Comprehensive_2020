package com.example.learnjava;

public class Microphone {
    // instance variables
    String name;
    String color;
    int model;

    public void turnOff() {
        System.out.println(this.name + "... Turning Off");
    }

    public void turnOn() {
        System.out.println(this.name + "... Turning On");
    }

    public void setVolume() {
        System.out.println(this.name + "... Setting Volume");
    }

    public String showDescription(){
        return "Microphone name " + this.name + " with color: " + this.color
                + " with model number: " + this.model;
    }
}
