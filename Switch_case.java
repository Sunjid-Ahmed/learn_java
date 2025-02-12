
//switch case
import java.util.Scanner;

public class Switch_case {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int day = Input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("sunday-friday");
        }
        Input.close();
    }
}