import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class BankAccount {
        private String accountNumber;
        private String accountHolder;
        private double balance;
        private ArrayList<String> transactions;

        BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
            transactions = new ArrayList<>();

            transactions.add("Account created. Initial balance: " + balance);
        }

        void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit amount!");
                return;
            }

            balance += amount;
            transactions.add("Deposited: " + amount);

            System.out.println("Amount deposited successfully.");
        }

        void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount!");
            } else if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
                transactions.add("Withdrawn: " + amount);

                System.out.println("Amount withdrawn successfully.");
            }
        }

        void checkBalance() {
            System.out.println("Current Balance: Rs." + balance);
        }

        void displayAccount() {
            System.out.println("\n----- Account Details -----");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: Rs." + balance);
        }

        void showTransactions() {
            System.out.println("\n----- Transaction History -----");

            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANKING TRANSACTION SYSTEM =====");

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account =
                new BankAccount(accountNumber, accountHolder, balance);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.displayAccount();
                    break;

                case 5:
                    account.showTransactions();
                    break;

                case 6:
                    System.out.println("Thank you for using Banking Transaction System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
===== BANKING TRANSACTION SYSTEM =====
Enter Account Number: 12345
Enter Account Holder Name: likil
Enter Initial Balance: 10000

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 1
Enter deposit amount: 2000
Amount deposited successfully.

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 2
Enter withdrawal amount: 1000
Amount withdrawn successfully.

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 3
Current Balance: Rs.11000.0

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 2
Enter withdrawal amount: 1000
Amount withdrawn successfully.

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 3
Current Balance: Rs.10000.0

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 4

----- Account Details -----
Account Number: 12345
Account Holder: likil
Balance: Rs.10000.0

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 5

----- Transaction History -----
Account created. Initial balance: 10000.0
Deposited: 2000.0
Withdrawn: 1000.0
Withdrawn: 1000.0

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 6
Thank you for using Banking Transaction System!

=== Code Execution Successful ===
