
//conditional statements
import java.util.Scanner;

public class If_Else {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        // pen=10 //notebook= 40
        System.out.print("Enter the amount of money you have: ");
        int money = Input.nextInt();
        if (money < 10) {
            System.out.println("You don't have enough money");
            System.out.println("You need more money to buy something...");
        } else if (money >= 10 && money < 50) {
            System.out.println("You can buy only one item");
        } else {
            System.out.println("You can buy all items...");
        }
        Input.close();
    }
}