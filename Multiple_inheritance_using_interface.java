interface Animal {
    void walk();// by default abstruct also public

    int eyes = 2;

}

interface herbivore {
    // void eat();
}

class Dog implements Animal, herbivore {
    public void walk() { // it must be public to get proper access
        System.out.println("I am walking");
    }
}

class Cat implements Animal {

    public void walk() {
        System.out.println("I am meowing");
    }
}

public class Multiple_inheritance_using_interface {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.walk();
        c1.walk();
        System.out.println("I'm a dog, I have " + d1.eyes + " eyes");
        System.out.println("I'm a cat, I have " + c1.eyes + " eyes");
        // Animal.eyes = 3; // compile time error: cannot assign a value to final
        // variable Animal.eyes

    }
}