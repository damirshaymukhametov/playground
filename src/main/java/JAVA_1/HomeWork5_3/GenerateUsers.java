package JAVA_1.HomeWork5_3;

public class GenerateUsers {
    public static void main(String[] args) {
        User[] users = new User[10];
        String[] names = {"Иван", "Петр", "Сергей", "Алексей", "Дмитрий"};
        String[] lastNames = {"Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов"};

        for (int i = 0; i < users.length; i++) {
            String name = names[(int) (Math.random() * names.length)];
            String lastName = lastNames[(int) (Math.random() * lastNames.length)];
            int age = (int) (Math.random() * 100) + 1;

            users[i] = new User(name, lastName, age);
        }

        for (User user : users) {
            System.out.println(user);
        }
    }
}
