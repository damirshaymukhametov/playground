package JAVA_1.HomeWork5_1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 4);
        Car car2 = new Car("Honda");
        Car car3 = new Car("Ford", 2);


        car1.getPatrol();
        car1.startEngine();
        car1.displayInfo();

        car2.getPatrol();
        car2.startEngine();
        car2.displayInfo();

        car3.getPatrol();
        car3.startEngine();
        car3.displayInfo();

        Car.printHowManyExamplesAreSold();
    }
}
