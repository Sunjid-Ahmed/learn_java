public class Ternary {
    public static void main(String[] args) {
        int a = 5;
        int myAge = 25;
        int votingAge = 18;
        String result = (myAge >= votingAge) ? "Old enough to vote" : "Not old enough to vote";

        System.out.println(result);
        String A = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(A);
    }
}
