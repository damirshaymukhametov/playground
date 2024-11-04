package JAVA_1.Coursework.utils;

import JAVA_1.Coursework.Apple;
import JAVA_1.Coursework.Fruit;
import JAVA_1.Coursework.Orange;
import com.github.javafaker.Faker;


public class RandomUtils {
    private static final Faker faker = Faker.instance();

    public static Fruit[] generateRandomFruits() {
        int count = faker.number().numberBetween(5, 15);
        Fruit[] fruits = new Fruit[count];

        for (int i = 0; i < count; i++) {
            String variety = faker.name().name();

            if (i % 2 == 0) {
                fruits[i] = new Apple(
                        faker.number().randomDouble(2, 1, 2),
                        variety,
                        faker.bool().bool(),
                        faker.bool().bool()
                );
            } else {
                fruits[i] = new Orange(
                        faker.number().randomDouble(2, 1, 2),
                        variety,
                        faker.number().randomDouble(2, 1, 10),
                        faker.number().numberBetween(5, 15)
                );
            }
        }
        return fruits;
    }
}


