import java.util.Scanner;

public class Tui {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String name;
        int age;
        float cgpa;

        System.out.print("Enter your name: ");
        name = myobj.nextLine(); // Reads the full name (with spaces, if any)

        System.out.print("Enter your age: ");
        age = myobj.nextInt();

        System.out.print("Enter your cgpa: ");
        cgpa = myobj.nextFloat();

        // Display the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("The name is: " + name + " & the age is: " + age + " & the cgpa is: " + cgpa);

        myobj.close(); // Close the Scanner to release resources
    }
}
