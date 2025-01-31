import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 99;
        marks[1] = 93;
        marks[2] = 97;
        marks[3] = 100;
        System.out.println("Before Sorting: " + marks[0]);
        Arrays.sort(marks);
        System.out.println("After Sorting: " + marks[0]);
    }
}