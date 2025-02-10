
//String uppercase and lowercase
import java.util.Scanner;

public class Uppercase_lowercase {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Str = Input.nextLine();
        System.out.println("The string in uppercase is: " + Str.toUpperCase());
        System.out.println("The string in lowercase is: " + Str.toLowerCase());
        Input.close();

    }
}