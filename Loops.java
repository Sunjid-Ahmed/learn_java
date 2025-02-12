
// loops
// for loops
import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = Input.nextInt();
        // // increasing order
        // for (int i = 0; i <= n; i++) {
        // System.out.println(i);
        // }
        // // decreasing order
        // for (int i = n; i >= 0; i--) {
        // System.out.println(i);
        // }

        // // while loop
        // System.out.print("Enter a number (j): ");
        // int j = Input.nextInt();
        // System.out.print("Enter a number (k): ");
        // int k = Input.nextInt();
        // while (j >= k) {
        // System.out.println(j);
        // j--;
        // }

        // do while loop
        System.out.print("Enter a number (l): ");
        int l = Input.nextInt();
        System.out.print("Enter a number (m): ");
        int m = Input.nextInt();
        do {
            System.out.println(l);
            l++;
        } while (l <= m);

        Input.close();

    }
}