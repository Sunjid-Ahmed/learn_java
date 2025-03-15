// Parent class
class Vehicle {  
    int speed = 50;  
}  

// Child class
class Bike extends Vehicle {  
    int speed = 100;  

    void display() {  
        System.out.println(super.speed); // Prints vehicle's speed (50)
    }  
}  

// Main class
public class Example2 {  
    public static void main(String args[]) {  
        Bike b = new Bike();  
        b.display();  // Output: 50
    }  
}  
