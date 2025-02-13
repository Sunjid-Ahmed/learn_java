import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Mynumber; // Declare only once
        int Usernumber = (int) (Math.random() * 100); // Ensure number is between 1 and 100

        do {
            System.out.print("Enter a number between 1 and 100:");
            Mynumber = Input.nextInt(); // Read user input

            if (Mynumber == Usernumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break; // Exit loop when correct number is guessed
            } else if (Mynumber > Usernumber) {
                System.out.println("Try a smaller number");
            } else {
                System.out.println("Try a larger number");
            }
        } while (Usernumber >= 0); // Loop until the user guesses correctly

        System.out.println("The correct number was: " + Usernumber); // Display the correct number
        Input.close(); // Close the scanner
    }
}
