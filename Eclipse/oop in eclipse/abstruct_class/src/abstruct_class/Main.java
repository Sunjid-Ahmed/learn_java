package abstruct_class;

public class Main {
public static void main(String args[]) {
FictionBook b1=new FictionBook("harrypoter","john","advanture");
b1.displayInfo();
System.out.println(b1.isRecommendedForAge(4));
}
}
