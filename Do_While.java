
//apna college mini project using do while loop
import java.util.Scanner;

public class Do_While {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Enter a number: ");
            number = Input.nextInt();
            System.out.println("You entered: " + number);
            // System.out.println(number);

        } while (number >= 0);
        System.out.println("THE END !");
        Input.close();
    }

}