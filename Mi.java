import java.util.Scanner; // import the Scanner class 

class Mi {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        String userName;

        int age;

        float cgpa;

        // Enter username and press Enter

        System.out.print("Enter name:");

        userName = myObj.nextLine();

        System.out.print("enter age:");

        age = myObj.nextInt();

        System.out.print("enter cgpa:");

        cgpa = myObj.nextFloat();

        System.out.println("Mr." + userName + " is " + age + " years old & the cgpa is: " + cgpa);

    }

}