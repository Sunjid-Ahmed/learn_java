import java.util.Scanner;

public class Ami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("The name is " + name + " and the age is " + age);

        // scanner.close();
    }
}