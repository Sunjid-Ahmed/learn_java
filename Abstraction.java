abstract class Animal { // Corrected abstract class declaration
    abstract void walk();

    // constructor
    Animal() {
        System.out.println("Animal is created");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }; // Abstract method must end with a semicolon
}

// Dog class extending Animal
class Dog extends Animal {

    // constructor
    Dog() {
        System.out.println("Dog is created");
    }

    public void walk() {
        System.out.println("Dog is walking");
    }
}

// Chicken class extending Animal
class Chicken extends Animal {

    // constructor
    Chicken() {
        System.out.println("Chicken is created");
    }

    public void walk() {
        System.out.println("Chicken is walking");
    }
}

// Main class to test abstraction
public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Chicken c = new Chicken();

        c.walk();
        d.walk();
        c.eat();
        // Animal a = new Animal(); // Cannot instantiate the type Animal
        // a.walk(); // run time error: cannot invoke walk() on object a; method walk is
        // abstract
    }
}
