import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = my.nextLine();
        System.out.print("Enter your age:");
        int age = my.nextInt();
        System.out.print("Enter your salary:");
        double salary = my.nextDouble();
        System.out.print("Enter your cgpa: ");
        float cgpa = my.nextFloat();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("Name " + name + " Age " + age + " Salary " + salary + " Cgpa " + cgpa);
        my.close();
    }
}