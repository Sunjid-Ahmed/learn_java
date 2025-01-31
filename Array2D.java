import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int marks[] = { 99, 76, 79, 95 };
        int[][] finalmarks = { { 96, 95, 94, 97 }, { 91, 97, 90, 100 } };
        System.out.println("Marks of student 1st is: " + marks[0]);
        System.out.println("Marks of student 1st is: " + marks[1]);
        System.out.println("Marks of student 1st is: " + marks[2]);
        System.out.println("Marks of student 1st is: " + marks[3]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][0]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][1]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][2]);
        System.out.println("Marks of student 1 is: " + finalmarks[0][3]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][0]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][1]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][2]);
        System.out.println("Marks of student 2 is: " + finalmarks[1][3]);
        System.out.println("After sorting:");
        Arrays.sort(marks);
        System.out.println("Marks of student 1st is: " + marks[0]);
        System.out.println("Marks of student 1st is: " + marks[1]);
        System.out.println("Marks of student 1st is: " + marks[2]);
        System.out.println("Marks of student 1st is: " + marks[3]);
        System.out.print("Total marks of student: ");
        System.out.println(marks[0] + marks[1] + marks[2] + marks[3]);
        // Arrays.sort(finalmarks);
        // System.out.println("Marks of student 1 is: " + finalmarks[0][0]);
        // System.out.println("Marks of student 1 is: " + finalmarks[0][1]);
        // System.out.println("Marks of student 1 is: " + finalmarks[0][2]);
        // System.out.println("Marks of student 1 is: " + finalmarks[0][3]);
        // System.out.println("Marks of student 2 is: " + finalmarks[1][0]);
        // System.out.println("Marks of student 2 is: " + finalmarks[1][1]);
        // System.out.println("Marks of student 2 is: " + finalmarks[1][2]);
        // System.out.println("Marks of student 2 is: " + finalmarks[1][3]);

    }
}