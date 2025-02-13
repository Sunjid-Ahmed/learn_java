//break & continue statement
public class Continue {
    public static void main(String args[]) {
        int i = 0;
        while (true) {
            if (i == 3 || i == 4) {
                i++;
                continue;

            }
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}