package com.example.learnjava;

public class Manager extends Employee {
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 10000;
    }

    public String toString() {
        return this.getFirstName() + ", " + this.getLastName();
    }
}
