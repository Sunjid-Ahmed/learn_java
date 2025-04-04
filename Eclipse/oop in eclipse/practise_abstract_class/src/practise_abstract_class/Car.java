package practise_abstract_class;

class Car extends Vehicle {
    // Override abstract move method
     @Override 
    public  void move() {
        System.out.println("Car is driving on the road.");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        Car car = new Car();
        car.move();  // Calls overridden move() method
        car.carry(); // Calls inherited carry() method
    }
}
