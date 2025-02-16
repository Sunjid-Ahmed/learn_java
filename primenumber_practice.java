import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting: ");
        int n = input.nextInt();

        System.out.print("Enter the range: ");
        int number = input.nextInt();

        // Ensure starting number is at least 2
        if (n < 2) {
            n = 2;
        }

        System.out.println("Prime numbers from " + n + " up to " + number + " are:");

        for (int i = 2; i <= number; i++) { // Start from n
            int count = 0; // Reset count for each number

            for (int j = 2; j < i; j++) { // Check divisibility
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) { // If no divisors found, it's prime
                System.out.println(i);
            }
        }
        input.close();
    }
}
