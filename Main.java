class Pen {
    String name;
    String color;
    String type;

    Pen(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void print_info() { // Changed return type from String to void
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
    }
}

public class Main { // Changed class name to Main (Java naming convention)
    public static void main(String[] args) {
        Pen p = new Pen("Cello", "Blue", "Gel");
        p.print_info();
    }
}
