import java.util.Scanner;

public class OperatorALL {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        double A = Input.nextDouble();
        System.out.print("Enter a number B: ");
        double B = Input.nextDouble();

        // Arithmetic Operators
        System.out.println("A + B = " + (A + B));
        System.out.println("A - B = " + (A - B));
        System.out.println("A * B = " + (A * B));
        System.out.println("A / B = " + (A / B));
        System.out.println("A % B = " + (A % B));

        // Relational Operators
        System.out.println("A > B = " + (A > B));
        System.out.println("A < B = " + (A < B));
        System.out.println("A == B = " + (A == B));
        System.out.println("A != B = " + (A != B));
        System.out.println("A >= B = " + (A >= B));
        System.out.println("A <= B = " + (A <= B));

        // Logical Operators
        System.out.println("(A > B) && (A < B) = " + ((A > B) && (A < B)));
        System.out.println("(A > B) || (A < B) = " + ((A > B) || (A < B)));
        System.out.println("!(A > B) = " + !(A > B));

        // Bitwise Operators (Converted A and B to Integers)
        int intA = (int) A;
        int intB = (int) B;
        System.out.println("A & B = " + (intA & intB)); // Bitwise AND
        System.out.println("A | B = " + (intA | intB)); // Bitwise OR
        System.out.println("A ^ B = " + (intA ^ intB)); // Bitwise XOR
        System.out.println("~A = " + (~intA)); // Bitwise NOT for A
        System.out.println("~B = " + (~intB)); // Bitwise NOT for B

        // Increment and Decrement Operators
        ++A;
        System.out.println("++A = " + A);
        --B;
        System.out.println("--B = " + B);
        A++;
        System.out.println("A++ = " + A);
        B--;
        System.out.println("B-- = " + B);

        // Ternary Operator
        System.out.println("A > B ? A : B = " + (A > B ? A : B));

        // Close Scanner
        Input.close();
    }
}
