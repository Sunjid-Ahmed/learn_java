public class SubString {
    public static void main(String[] args) {
        String name = "aman and akku";
        System.out.println(name.substring(0, 4));// last index does not count so we need to add 1 more index to the last
                                                 // index/end index
        System.out.println(name.substring(5, 8));
        System.out.println(name.substring(9, 13));

    }
}