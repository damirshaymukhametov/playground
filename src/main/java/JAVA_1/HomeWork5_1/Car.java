package JAVA_1.HomeWork5_1;

public class Car {
    private static final int wheels = 4;
    String name;
    int doors;

    public Car(String name, int doors) {
        this.name = name;
        this.doors = doors;
    }

    public Car(String name) {
        this.name = name;
    }

    public void getPatrol() {
        System.out.println(name + " Заправляем АИ-95");
    }
    public void startEngine() {
        System.out.println(name + " Двигатель запущен");
    }
    public static void printHowManyExamplesAreSold() {
        System.out.println("Информация о проданных экзеплярах автомобилях.");
    }

    public void displayInfo() {
        System.out.println("Марка автомобиля: " + name);
        System.out.println("Количество дверей: " + doors);
        System.out.println("Количество колес по умолчанию: " + wheels);
    }
}
