package Coursework;

import Coursework.utils.RandomUtils;


public class Main {
    public static void main(String[] args) {
        // Создаем фрукты
        Fruit[] fruits = RandomUtils.generateRandomFruits();

        // Создаем хранилище и два магазина
        CityStorage cityStorage = new CityStorage();
        Shop shop1 = new Shop("улица Ленина, 2");
        Shop shop2 = new Shop( "проспект Ветеранов, 56");

        // Генерируем случайные фрукты и добавляем их в хранилище
        cityStorage.addFruits(fruits); // Добавляем фрукты в хранилище

        // Выводим текущее состояние CityStorage и магазинов
        System.out.println(String.format("В начале на овощебазу завезли: %s", cityStorage));
        System.out.println(String.format("Магазин 1: %s", shop1));
        System.out.println(String.format("Магазин 2: %s", shop2));

        // Отгружаем 2 фрукта в первый магазин
        cityStorage.shipFruits(shop1, 2);
        // Отгружаем 3 фрукта во второй магазин
        cityStorage.shipFruits(shop2, 3);

        // Выводим обновленное состояние CityStorage и магазинов
        System.out.println(String.format("\nОвощебаза после отгрузки: %s", cityStorage));
        System.out.println(String.format("Магазин 1 после отгрузки: %s", shop1));
        System.out.println(String.format("Магазин 2 после отгрузки: %s", shop2));
    }
}