public class ExceptionDemo { // Renamed the class
    public static void main(String[] args) {
        int[] array = { 98, 56, 98, 76 };
        try {
            System.out.println(array[1]); // This will cause an exception
        } catch (ArrayIndexOutOfBoundsException e) { // Catch the specific exception
            System.out.println("Array index is out of bounds!");
        }
        System.out.println("The program executed successfully");
    }
}
