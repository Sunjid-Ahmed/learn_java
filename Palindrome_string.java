import java.util.Scanner;

public class Palindrome_string {
    public static void main(String args[]) {
        String str, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        str = in.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + str.charAt(i);
        if (str.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");
    }
}
