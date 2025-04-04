package practise_abstract_class;

 class Boat extends Vehicle {
    // Override abstract move method
    @Override
    public void move() {
        System.out.println("Boat is sailing on the water.");
    }

    // Main method to test the Boat class
    public static void main(String[] args) {
        Boat boat = new Boat();
  
        boat.move();  // Calls overridden move() method
        boat.carry(); // Calls inherited carry() method
    }
}