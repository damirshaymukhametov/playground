package JAVA_2.HomeWork1;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        String[] pinCodes = new String[4];

        pinCodes[0] = "1111";
        pinCodes[1] = "2222";
        pinCodes[2] = "3333";
        pinCodes[3] = "4444";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер ячейки (0-3), чтобы получить пин-код:");

        try {
            int index = scanner.nextInt();
            System.out.println("Ваш пин-код: " + pinCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Вы ввели некорректный номер ячейки. Пожалуйста, введите число от 0 до 3.");
        } catch (Exception e) {
            System.out.println("Ошибка: Произошла ошибка при вводе. Пожалуйста, попробуйте снова.");
        } finally {
            scanner.close();
        }
    }
}
