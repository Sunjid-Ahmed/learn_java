import java.util.Arrays;

public class Array2_D {
    public static void main(String[] args) {
        int[][] finalmarks = { { 96, 95, 94, 97 }, { 91, 97, 90, 100 } };
        System.out.println("Before sorting:");
        System.out.println("Marks of student 1 is: " + finalmarks[0][0]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][1]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][2]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][3]);
        System.out.println("Before sorting:");
        System.out.println("Marks of student 2 is: " + finalmarks[1][0]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][1]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][2]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][3]);
        System.out.println("After sorting:");
        Arrays.sort(finalmarks[0]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][0]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][1]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][2]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][3]);
        System.out.println("After sorting:");
        Arrays.sort(finalmarks[1]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][0]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][1]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][2]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][3]);

    }
}