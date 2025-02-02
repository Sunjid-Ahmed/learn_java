import java.lang.Math;
import java.util.Scanner;

public class ExerciseMath {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius:");
        float radius = input.nextFloat();
        System.out.println("Area: " + Math.PI * Math.pow(radius, 2));
        input.close();

    }
}