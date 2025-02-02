import java.util.Scanner;
import java.lang.Math;

public class In {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = in.nextFloat();
        System.out.println("The area of the circle is: " + Math.PI * Math.pow(radius, 2));
        in.close();
    }
}