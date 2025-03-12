class Student { // Data-holding class
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Separate class to access Student details
class StudentInfo {
    public void display(Student student) {
        System.out.println("Student Name: " + student.getName());
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");

        StudentInfo info = new StudentInfo();
        info.display(student); // Output: Student Name: Alice

        student.setName("Bob");
        info.display(student); // Output: Student Name: Bob
    }
}
