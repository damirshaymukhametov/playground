package JAVA_1.HomeWork2_1;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;

        double fahrenheit = celsius * 9/5 + 32;

        System.out.println("Температура по Цельсию: " + celsius + " градусов");
        System.out.println("Температура по Фаренгейту: " + fahrenheit + " градусов");
    }
}

