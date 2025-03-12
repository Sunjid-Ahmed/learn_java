class Copy_constructor {
    public String name;
    public int age;

    Copy_constructor() {
        System.out.println("I am a copy constructor");
    }

    Copy_constructor(Copy_constructor s2) {
        this.name = s2.name;
        this.age = s2.age;

    }

    public void display() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }

    public static void main(String[] args) {
        Copy_constructor s1 = new Copy_constructor();
        s1.name = "sunjid";
        s1.age = 23;
        Copy_constructor s2 = new Copy_constructor(s1);
        s2.display();
    }
}