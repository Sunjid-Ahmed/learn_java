package New;

import java.util.Random;

class Account {
    public String name;
    String email;
    private String password;
    protected int accountNumber;

    // Private method to set password
    private void setPassword(String password) {
        this.password = password;
    }

    // Public method to generate and retrieve a password
    public String getPassword() {
        setPassword(randomPass()); // Assigns a random password
        return password;
    }

    // Method to generate a random password
    private String randomPass() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) { // Generating an 8-character password
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}

public class Access_Modifier {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Rahul";
        a1.email = "sunjidf@gmail.com";
        // Cannot directly access private method
        // a1.setPassword("rahul123");
        a1.accountNumber = 1234567890; // Allowed since it's in the same package

        System.out.println("Name: " + a1.name);
        System.out.println("Email: " + a1.email);
        System.out.println("Generated Password: " + a1.getPassword()); // Retrieves a random password
        System.out.println("Account Number: " + a1.accountNumber);
    }
}
