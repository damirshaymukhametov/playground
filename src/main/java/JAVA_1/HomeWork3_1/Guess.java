package JAVA_1.HomeWork3_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        String[] deck = {"6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        System.out.println("Сегодня у нас в колоде: " + Arrays.toString(deck));
        String chooseCard = deck[(int) (Math.random() * deck.length)];
        //System.out.println(chooseCard);

        System.out.println("Выбери карту");
        Scanner sc = new Scanner(System.in);
        String userSelection = sc.nextLine();
        boolean result = chooseCard.equals(userSelection);

        String userMessage = result ? "Угадал!" : "Не угадал!";

        System.out.println(String.format(userMessage + " : %s", result));

    }


}
