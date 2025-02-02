import java.util.Scanner;
import java.util.Arrays;

public class EX_Array {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = input.nextInt();
        System.out.print("Ente the elements of the array: ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();

        }
        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println("The array as a string:");
        System.out.println(Arrays.toString(array));
        System.out.println("Aftyer sorting:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        input.close();

    }
}