package practise_abstract_class;

public abstract class Vehicle {
	    // Constructor
	    public Vehicle() {
	        System.out.println("Vehicle created.");
	    }

	    // Abstract method (must be implemented by subclasses)
	    public abstract void move();

	    // Concrete method (inherited by subclasses)
	    public void carry() {
	        System.out.println("Vehicle is carrying passengers or goods.");
	    }
	}

