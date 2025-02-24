class MethodExample {
    // 1.Method with no arguments and no return value
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // 2. Method with arguments but no return value
    public static void displayMessage(String message) {
        System.out.println("message:" + message);
    }

    // 3. Method with no arguments but with return value
    public static int getNumber() {
        return 42;
    }

    // 4. Method with arguments and with return value
    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // calling methos with no arguments and no return value
        greet();

        // calling method with arguments but no return value
        displayMessage("Hello, World!");

        // calling method with no arguments but with return value
        int number = getNumber();

        System.out.println("Number: " + number);
        // calling method with arguments and with return value

        int sum = addNumber(5, 7);

        System.out.println("Sum: " + sum);
    }

}