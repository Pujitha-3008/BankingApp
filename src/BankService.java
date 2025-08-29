import java.util.HashMap;
import java.util.Scanner;

public class BankService {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private int accountCounter = 1001;
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter customer name: ");
        String name = sc.next();
        Account acc = new Account(accountCounter, name, 0.0);
        accounts.put(accountCounter, acc);
        System.out.println("Account created! Account Number: " + accountCounter);
        accountCounter++;
    }

    public void deposit() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.setBalance(acc.getBalance() + amt);
            System.out.println("Deposit successful. New Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        Account acc = accounts.get(accNo);
        if (acc != null) {
            if (acc.getBalance() >= amt) {
                acc.setBalance(acc.getBalance() - amt);
                System.out.println("Withdrawal successful. New Balance: " + acc.getBalance());
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        Account acc = accounts.get(accNo);
        if (acc != null) {
            System.out.println("Account Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}

