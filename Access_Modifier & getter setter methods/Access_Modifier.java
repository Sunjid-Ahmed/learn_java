package New;

class Account {
    public String name;
    String email;
    private String password;
    protected int accountNumber;

    public void setPassword(String password) {
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

}

public class Access_Modifier {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Rahul";
        a1.email = "sunjidf@gmail.com";
        a1.setPassword("rahul123");
        a1.accountNumber = 1234567890;
        System.out.println("Name: " + a1.name);
        System.out.println("Email: " + a1.email);
        System.out.println("Password: " + a1.getPassword());
        System.out.println("Account Number: " + a1.accountNumber);
    }
}
