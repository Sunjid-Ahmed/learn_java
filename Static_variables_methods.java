class Student {
    public int rollno;
    public String name;
    static String college = "ITS";

    static void change() {
        college = "BBDIT";
    }
}

public class Static_variables_methods {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 100;
        s1.name = "Sachin";
        Student s2 = new Student();
        s2.rollno = 101;
        s2.name = "Rahul";
        System.out.println(s1.rollno + " " + s1.name + " " + s1.college);// call through object methods
        System.out.println(s2.rollno + " " + s2.name + " " + Student.college); // call through class name
        Student.change();
        System.out.println(s1.rollno + " " + s1.name + " " + s1.college);
        System.out.println(s2.rollno + " " + s2.name + " " + Student.college);

    }
}
