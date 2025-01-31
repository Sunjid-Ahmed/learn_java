import java.util.Scanner;

public class Input2Numberand {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = Input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = Input.nextInt();
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
        System.out.println("The sum of the two numbers is: " + (num1 + num2));
        System.out.println("The difference of the two numbers is: " + (num1 - num2));
        System.out.println("The product of the two numbers is: " + (num1 * num2));
        System.out.println("The division of the two numbers is: " + (num1 / num2));
        System.out.println("The remainder of the two numbers is: " + (num1 % num2));
        Input.close();
    }
}