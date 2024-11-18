package JAVA_2.HomeWork2;


public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws RuntimeException {
        if (amount > balance) {
            throw new RuntimeException("Недостаточно средств на счете.");
        }
        balance -= amount;
    }

    public void deposit(double amount) throws RuntimeException {
        if (amount <= 0) {
            throw new RuntimeException("Сумма депозита должна быть положительной.");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

