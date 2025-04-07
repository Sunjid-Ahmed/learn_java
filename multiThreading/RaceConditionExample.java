class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {// synchronized is used to run the withdraw method in a single thread at a
                                            // time
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw successful. Remaining balance: " +
                    balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class User extends Thread {
    BankAccount account;

    User(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

public class RaceConditionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        User u1 = new User(account);
        User u2 = new User(account);

        u1.start();
        u2.start();
    }
}
