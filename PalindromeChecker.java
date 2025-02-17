import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = Input.nextLine(); // Fixed 'nextline()' -> 'nextLine()'
        String Org_str = str;
        int len = str.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (Org_str.equals(rev)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " isn't a palindrome."); // Fixed missing space
        }

        Input.close(); // Closing Scanner to prevent memory leaks
    }
}
