//string all possible case
public class String_all_case {
    public static void main(String args[]) {
        String Str = "Abdullah AL Nahid";
        String Str1 = "Sadik Ibne Qadir";
        System.out.println("1'st String: " + Str);
        System.out.println("2'nd String: " + Str1);
        System.out.println("1's string in uppercase: " + Str.toUpperCase());
        System.out.println("2'nd string in lowercase: " + Str1.toLowerCase());
        System.out.println("Length of 1'st String: " + Str.length());
        System.out.println("Length of 2'nd String: " + Str1.length());
        System.out.println("Location of \'AL\' in 1\'st  String: " + Str.indexOf("AL"));
        System.out.println("Location of \'Ibne\' in 2\'nd  String: " + Str1.indexOf("Ibne"));
        System.out.println("Location of \'Qadir\' in 2\'nd  String: " + Str1.indexOf("Qadir"));
        System.out.println("concatenation: " + Str + " " + Str1);
        System.out.println("Single Quote: " + "It\'s Alright");
        System.out.println("Double Quote: " + "\"It's Alright\"");
        System.out.println("Single\\: " + "It\\s Alright");

    }
}