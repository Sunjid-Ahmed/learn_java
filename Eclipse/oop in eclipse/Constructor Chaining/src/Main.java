// Parent class
class Person {
    public Person() {
        System.out.println("(1) Person's no-arg constructor is invoked");
    }
}

// Intermediate class
class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee’s overloaded constructor");
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

// Child class
public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty(); // Creating Faculty object triggers constructor chain
    }

    public Faculty() {
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
}

