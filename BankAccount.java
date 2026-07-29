/*Assignment 2: Bank Account System
Question
Create a Java program that simulates a simple bank account.

Requirements:
Create a class named BankAccount.
The class should contain:
Account Number
Account Holder Name
Balance
Create a parameterized constructor to initialize all the values.
Create the following methods:
deposit(double amount) – Adds money to the account.
withdraw(double amount) – Deducts money only if sufficient balance is available.
displayBalance() – Displays the current balance.
In the main() method:
Create two BankAccount objects.
Perform deposit and withdrawal operations.
Display the final balance of each account.
Bonus Challenge: Display the total number of bank accounts created using a static variable.

 */
  
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private static int totalAccounts = 0; // Static variable to keep track of total accounts

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++; // Increment total accounts when a new account is created
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Current Balance: " + balance);
    }

    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("654321", "Jane Smith", 500.0);

        account1.deposit(200.0);
        account1.withdraw(150.0);
        account1.displayBalance();

        account2.deposit(300.0);
        account2.withdraw(100.0);
        account2.displayBalance();

        System.out.println("Total bank accounts created: " + BankAccount.getTotalAccounts());
    }
  
}