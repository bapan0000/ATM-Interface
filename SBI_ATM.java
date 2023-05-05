import java.util.ArrayList;
import java.util.Scanner;

public class SBI_ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 1000;
    private static ArrayList<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Transaction History");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    showTransactionHistory();
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
        transactionHistory.add("Balance checked. Current balance: $" + balance);
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            transactionHistory.add("Attempted to withdraw $" + amount + " but failed due to insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("You have withdrawn: $" + amount);
        System.out.println("Your new balance is: $" + balance);
        transactionHistory.add("Withdrawn $" + amount + ". Current balance: $" + balance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();

        balance += amount;
        System.out.println("You have deposited: $" + amount);
        System.out.println("Your new balance is: $" + balance);
        transactionHistory.add("Deposited $" + amount + ". Current balance: $" + balance);
    }

    private static void transfer() {
        System.out.print("Enter account number to transfer to: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter amount to transfer: ");
        int amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            transactionHistory.add("Attempted to transfer $" + amount + " to account " + accountNumber +
                    " but failed due to insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("Transferred $" + amount + " to account " + accountNumber);
        System.out.println("Your new balance is: $" + balance);
        transactionHistory.add("Transferred $" + amount + " to account " + accountNumber +
                ". Current balance: $" + balance);
    }

    private static void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
