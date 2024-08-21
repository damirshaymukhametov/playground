package HomeWork8_1;

import org.apache.commons.lang3.StringUtils;

public class Main {
    //передать в str нужную строку
    public static String str = "фыва";

    public static String reverseString(String str) {
        return StringUtils.reverse(str);
    }

    public static String toggleCase(String str) {
        return StringUtils.swapCase(str);
    }

    public static void main(String[] args) {
        System.out.println("Перевернутая строка: " + reverseString(str));
        System.out.println(("Строка с измененным регистром: " + toggleCase(str)));
    }
}
