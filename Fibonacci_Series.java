import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the range you want to find out the fibonacci series: ");
        int n = Input.nextInt();
        int A = 0;
        int B = 1;
        int Count = 0;
        int fibo;
        System.out.print("Fibonacci series: ");

        while (Count < n) {
            if (Count <= 1) {
                fibo = Count;
            } else {
                fibo = A + B;
                A = B;
                B = fibo;
            }
            System.out.print(Integer.toString(fibo) + " ");
            Count++;
        }
        Input.close();
    }
}
