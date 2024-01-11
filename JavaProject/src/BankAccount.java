import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        Transaction transaction = new Transaction("Deposit", amount);
        this.balance += amount;
        this.transactionHistory.add(transaction);
    }

    public void withdraw(double amount) {
        Transaction transaction = new Transaction("Withdrawal", amount);
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactionHistory.add(transaction);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayTransactionHistory() {
        for (Transaction transaction : this.transactionHistory) {
            System.out
                    .println(transaction.getDate() + ": " + transaction.getType() + " KWD " + transaction.getAmount());
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}