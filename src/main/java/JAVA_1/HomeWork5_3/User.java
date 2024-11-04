package JAVA_1.HomeWork5_3;

public class User {
    int id;
    String name;
    String lastName;
    int age;

    public User(String name, String lastName, int age) {
        this.id = generateId(1,1000); // Генерация случайного идентификатора от 1 до 1000
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    int generateId(int min, int max) {
        return (int)(Math.random() * (max - min + 1)); // Генерация случайного числа в заданном диапазоне
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
