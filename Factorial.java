import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of " + n + " is: " + fact);
        Input.close();
    }
}