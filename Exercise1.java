class Pen {
    String name;
    String color;
    String type;

    public void print_something() {
        System.out.println("print_something.........");
    }

    public void print_info() {
        System.out.println("name: " + this.name);
        System.out.println("color: " + this.color);
        System.out.println("type: " + this.type);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.name = "Parker";
        p1.color = "Blue";
        p1.type = "Gel";
        p1.print_info();
        p1.print_something();
        Pen p2 = new Pen();
        p2.name = "Kim";
        p2.color = "Red";
        p2.type = "Ball";
        p2.print_info();
        p2.print_something();

    }

}
