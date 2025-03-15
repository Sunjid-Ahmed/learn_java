// Parent class
class Vehicle {  
    int speed = 50;  
}  

// Child class
class Bike extends Vehicle {  
    int speed = 100;  

    void display() {  
        System.out.println(speed); // Prints Bike's speed (100)
    }  
}  

// Main class
public class Example1 {  
    public static void main(String args[]) {  
        Bike b = new Bike();  
        b.display();  // Output: 100
    }  
}  
