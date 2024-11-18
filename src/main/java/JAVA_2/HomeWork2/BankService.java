package JAVA_2.HomeWork2;

public class BankService {
    public void transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Успешно переведено: " + amount + " рублей со счета " + fromAccount + " на счет " + toAccount);
        } catch (RuntimeException e) {
            System.out.println("Ошибка при переводе средств: " + e.getMessage());
        }
    }
}
