import banj.Bank; // Correct import statement

public class Package_import {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.print();
        b.print();

        Bank bank = new Bank();
        Bank.Account ob1 = bank.new Account();
        ob1.name = "ricky";

        System.out.println("Account Holder: " + ob1.name);
    }
}

// Base Vehicle Class
class Vehicle {
    public void print() {
        System.out.println("This is a vehicle class");
    }
}

// Car Class
class Car extends Vehicle {
    @Override
    public void print() {
        System.out.println("This is a car class");
    }
}

// Bike Class
class Bike extends Vehicle {
    @Override
    public void print() {
        System.out.println("This is a bike class");
    }
}
