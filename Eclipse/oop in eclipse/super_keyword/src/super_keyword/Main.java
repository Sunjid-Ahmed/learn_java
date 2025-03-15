// Parent class
class Vehicle {
    int speed = 50;

    public void display() {
        System.out.println("\nVehicle Speed = " + speed);
    }
}

// Child class
class Car extends Vehicle {
    @Override
    public void display() {
        super.display(); // Calls Vehicle's display()
        System.out.println("Car Speed = " + super.speed);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
