package JAVA_2.HomeWork1;

import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {
        DivisionCalculator calculator = new DivisionCalculator();
        calculator.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            int dividend = getDividend(scanner);
            int divisor = getDivisor(scanner);
            double result = divide(dividend, divisor);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно. Пожалуйста, введите ненулевое число для делителя.");
        } catch (Exception e) {
            System.out.println("Ошибка: Произошла ошибка при вводе. Пожалуйста, убедитесь, что вы вводите целые числа.");
        } finally {
            scanner.close();
        }
    }

    private int getDividend(Scanner scanner) {
        try {
            System.out.print("Введите первое целое число (делимое): ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка: Введено некорректное число. Пожалуйста, введите целое число.");
        }
    }

    private int getDivisor(Scanner scanner) {
        try {
            System.out.print("Введите второе целое число (делитель): ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка: Введено некорректное число. Пожалуйста, введите целое число.");
        }
    }

    private double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) dividend / divisor;
    }
}