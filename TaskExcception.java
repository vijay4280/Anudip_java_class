/*Task: Create a custom InsufficientBalanceException that is thrown when someone tries to withdraw more money than they have. */

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available balance: " + balance
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful!");
        System.out.println("Withdrawn amount: ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);
    }
}


public class TaskExcception {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}