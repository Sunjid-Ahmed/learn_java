public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.age());
        System.out.println(Cat.nickname()); // Prints -1 because Dog.age() is not overridden
    }
}