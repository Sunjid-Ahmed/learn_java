import java.util.Scanner;

public class StrInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = input.nextLine();
        System.out.println("You entered: " + name);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("You entered: " + num);
        System.out.print("Enter cgpa: ");
        float cgpa = input.nextFloat();
        System.out.println("You entered: " + cgpa);
        System.out.println("Name " + name + " Number " + num + " CGPA " + cgpa);
        input.close();
    }
}