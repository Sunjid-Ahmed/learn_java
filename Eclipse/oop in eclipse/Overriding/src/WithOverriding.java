class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class WithOverriding {
    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }
}
