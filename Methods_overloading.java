class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(String name) {
        System.out.println("Name: " + name);
    }

    public void display(int age) {
        System.out.println("Age: " + age);
    }

    public void display(String name, int age) {
        System.out.println("Name: " + name + "," + " Age: " + age);
    }
}

public class Methods_overloading {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        s1.display("John");
        s1.display(20);
        s1.display("John", 20);
    }
}