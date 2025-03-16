package laba2.Example7;

interface BankAccount {
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}

class BankAccountImpl implements BankAccount {
    private double balance;
    public BankAccountImpl(double initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds.");
            return false;
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccountImpl(1000.0);
        BankAccount account2 = new BankAccountImpl(500.0);

        System.out.println("Initial Balance for Account 1: " + account1.getBalance());
        System.out.println("Initial Balance for Account 2: " + account2.getBalance());

        account1.deposit(500.0);
        account2.withdraw(200.0);

        System.out.println("Balance for Account 1 after deposit: " + account1.getBalance());
        System.out.println("Balance for Account 2 after withdrawal: " + account2.getBalance());
    }
}

