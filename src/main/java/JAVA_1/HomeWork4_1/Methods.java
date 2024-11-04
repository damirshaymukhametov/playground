package JAVA_1.HomeWork4_1;

import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        String inputString = "Это пример строки с несколькими словами в ряд";
        int wordCount = countWords(inputString);
        System.out.println("Количество слов: " + wordCount);

        printHeroicMessage("Иван", "Иванов");
        
        System.out.println("Случайное слово: " + getRandomWord());
    }

    public static int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public static void printHeroicMessage(String firstName, String lastName) {
        System.out.println(String.format("Внимание! %s %s героически спасает прода от падения! Вам начислено 2 СМ коина.", firstName, lastName));
    }

    public static String getRandomWord() {
        String[] words = {"яблоко", "банан", "вишня", "груша", "апельсин"};
        return words[(int) (Math.random() * words.length)];
    }
}
