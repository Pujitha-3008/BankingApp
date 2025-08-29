import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking Application ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> bankService.createAccount();
                case 2 -> bankService.deposit();
                case 3 -> bankService.withdraw();
                case 4 -> bankService.checkBalance();
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

