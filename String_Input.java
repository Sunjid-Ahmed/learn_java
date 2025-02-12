
//String input
import java.util.Scanner;

public class String_Input {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = Input.next();// next will print only one word
        System.out.println("You entered: " + str);
        Input.nextLine();// this is to clear the buffer (if we use nextLine we don't need to write
                         // Input.nextLine())
        System.out.print("Enter another string: ");
        String str1 = Input.nextLine();// nextLine will print the whole line
        System.out.println("You entered: " + str1);
        Input.close();

    }

}