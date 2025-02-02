import java.util.Arrays;

public class Example_array {
    public static void main(String args[]) {
        int array[] = { 98, 88, 33, 78 };
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}