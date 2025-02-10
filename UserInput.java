import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String studentName = input.nextLine();

        System.out.print("Enter your ID: ");
        int studentID = input.nextInt();

        System.out.print("Enter your age: ");
        int studentAge = input.nextInt();

        System.out.print("Enter your Fee: ");
        float studentFee = input.nextFloat();

        // Consume the leftover newline character
        input.nextLine();

        System.out.print("Enter your Grade: ");
        String studentGrade = input1.nextLine();

        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Age: " + studentAge);
        System.out.println("Fee: " + studentFee);
        System.out.println("Grade: " + studentGrade);

        input.close();
    }
}
