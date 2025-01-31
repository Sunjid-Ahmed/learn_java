import java.util.Scanner;

public class InputInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Corrected Scanner object initialization

        System.out.println("Enter a number: ");
        float A = input.nextFloat(); // Used the `input` object to read input

        System.out.println("Enter another number: ");
        float B = input.nextFloat(); // Used the `input` object to read input

        float sum = A + B;
        System.out.println("Sum = " + sum);

        float min = A - B;
        System.out.println("Min = " + min);

        float mul = A * B;
        System.out.println("Mul = " + mul);

        float div = A / B;
        System.out.println("Div = " + div);

        float rem = A % B;
        System.out.println("Rem = " + rem);

        input.close(); // Close the Scanner to release resources
    }
}
