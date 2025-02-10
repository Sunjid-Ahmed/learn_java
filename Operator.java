import java.util.Scanner;

public class Operator {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number A :");
        double A = Input.nextDouble();
        System.out.print("Enter a number B :");
        double B = Input.nextDouble();
        // Assignment operator
        System.out.println("A+B= " + (A + B));
        System.out.println("A-B= " + (A - B));
        System.out.println("A*B= " + (A * B));
        System.out.println("A/B= " + (A / B));
        System.out.println("A%B= " + (A % B));
        Input.close();

        // Relational operators /comparison operators
        System.out.println("A>B= " + (A > B));
        System.out.println("A<B= " + (A < B));
        System.out.println("A==B= " + (A == B));
        System.out.println("A!=B= " + (A != B));
        System.out.println("A>=B= " + (A >= B));
        System.out.println("A<=B= " + (A <= B));
        // Logical operators
        System.out.println("A>B && A<B= " + (A > B && A < B));
        System.out.println("A>B || A<B= " + (A > B || A < B));
        System.out.println("!(A>B)= " + !(A > B));
        // Bitwise operators
        int A1 = (int) A;
        int B1 = (int) B;
        System.out.println("A&B= " + (A1 & B1));
        System.out.println("A|B= " + (A1 | B1));
        System.out.println("A^B= " + (A1 ^ B1));
        System.out.println("~A= " + (~A1));
        System.out.println("~B= " + (~B1));

        // increment and decrement operators
        // pre increment
        ++A;
        System.out.println("++A= " + A);
        // pre decrement
        --B;
        System.out.println("--B= " + B);
        // post increment
        A++;
        System.out.println("A++= " + A);
        // post decrement
        B--;
        System.out.println("B--= " + B);
        // ternary operator
        System.out.println("A>B?A:B= " + (A > B ? A : B));
    }
}