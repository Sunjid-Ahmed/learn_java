package super4;

//Parent class
class Vehicle {
    int speed = 50;

    public Vehicle(String color) {
        System.out.println("Vehicle is created with color: " + color);
    }

    public void display() {
        System.out.println("The vehicle speed is: " + speed);
    }
}

// Child class
class Car extends Vehicle {
    int speed = 100;

    public Car() {
        super("Red"); // Calls Vehicle constructor
        System.out.println("Car is created\n");
    }

    @Override
    public void display() {
        super.display(); // Calls Vehicle's display method
        System.out.println("Vehicle Speed is: " + super.speed);
        System.out.println("Car Speed is: " + speed);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
