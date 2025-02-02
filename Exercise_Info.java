
//Take some information about yourself (i.e. name, age, cgpa, department, section etc) as input and display them.
import java.util.Scanner;

public class Exercise_Info {
    public static void main(String args[]) {
        Scanner Information = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = Information.nextLine();
        System.out.print("Enter your age: ");
        int age = Information.nextInt();
        System.out.print("Enter your cgpa: ");
        double cgpa = Information.nextDouble();
        System.out.print("Enter your department: ");
        Information.nextLine();
        String department = Information.nextLine();
        System.out.print("Enter your section: ");
        String section = Information.nextLine();
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student cgpa: " + cgpa);
        System.out.println("Student department: " + department);
        System.out.println("Student section: " + section);
        Information.close();

    }
}