//constructor overriding
// Parent class
class Vehicle {
    int speed = 50;

    public Vehicle(int speed) {
        System.out.println("Vehicle is created");
        this.speed = speed;
    }
}

// Child class
class Car extends Vehicle {
    public Car() {
        super(100); // Calls Vehicle constructor
        System.out.println("Car is created");
    }

    public void display() {
        System.out.println("\nVehicle Speed = " + speed); // speed is inherited
        System.out.println("Car Speed = " + speed);
    }
public class Main{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}}
