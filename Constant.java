public class Constant {
    public static void main(String[] args) {
        // Normal varriable
        int age = 23;
        age = 25;
        age = 30;
        System.out.println(age);
        // Constant variable
        final int AGE = 23; // final keyword is used to make a variable constant (usually we write it as
                            // upper case)
        // AGE = 25; // This will give an error because we can't change the value of a
        // constant variable
        System.out.println(AGE);

    }
}