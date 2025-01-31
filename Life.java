import java.util.Scanner; // Fixed typo in "Scanner"

public class Life {
    public static void main(String[] args) {
        Scanner mi = new Scanner(System.in); // Corrected "Scanner" capitalization
        int age;

        System.out.print("Enter your age: ");
        age = mi.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        mi.close(); // Properly closed the scanner
    }
}
