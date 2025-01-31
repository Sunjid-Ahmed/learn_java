import java.util.Scanner;

public class Input2number {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float A = Input.nextFloat();
        System.out.println("Enter the second number");
        float B = Input.nextFloat();
        System.out.println("The sum := " + (A + B));
        System.out.println("The diff " + (A - B));
        System.out.println("The product " + (A * B));
        System.out.println("The division " + (A / B));
        System.out.println("The remainder " + (A % B));
        Input.close();

    }
}
