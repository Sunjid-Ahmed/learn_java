import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print: ");
        int n = input.nextInt();

        int A = 0;
        int B = 1;
        int fibo;

        System.out.print("Fibonacci Series: ");

        for (int count = 0; count < n; count++) {
            if (count <= 1) {
                fibo = count; // First two numbers are 0 and 1
            } else {
                fibo = A + B;
                A = B;
                B = fibo;
            }
            System.out.print(fibo + " "); // Print each term correctly
        }

        input.close();
    }
}
