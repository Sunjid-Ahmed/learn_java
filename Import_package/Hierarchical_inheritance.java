import java.util.*;
import bank.Bank; // Import the Bank class

class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of circle is " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    public void area(int l, int b) {
        System.out.println("Area of rectangle is " + (0.5 * l * b)); // Fixed floating-point division
    }
}

public class Hierarchical_inheritance {
    public static void main(String args[]) {
        Bank.Account account1 = new Bank.Account(); // Now properly defined
        account1.name = "customer"; // Fixed missing semicolon
        System.out.println("Account Holder: " + account1.name);
    }
}
