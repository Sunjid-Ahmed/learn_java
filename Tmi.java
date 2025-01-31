import java.util.Scanner;

public class Tmi {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String name;
        int age;
        float cgpa;

        System.out.print("Enter your name: ");
        name = myobj.nextLine();

        System.out.print("Enter your age:");
        age = myobj.nextInt();

        System.out.print("Enter your cgpa: ");
        cgpa = myobj.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("The name is " + name + " & the age is " + age + " & the cgpa is " + cgpa);

        myobj.close(); // Closing the Scanner to avoid resource leaks
    }
}
