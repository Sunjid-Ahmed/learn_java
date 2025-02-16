import java.util.Scanner;

public class Shibu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print: ");
        int n = input.nextInt();
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}