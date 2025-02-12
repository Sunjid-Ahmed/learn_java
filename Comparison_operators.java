import java.util.Scanner;

public class Comparison_operators {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        boolean A = Input.nextBoolean();
        if (A == true) {
            System.out.println("Day");

        } else {
            System.out.println("Night");
        }
        Input.close();
    }
}