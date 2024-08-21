package Coursework;

import java.util.ArrayList;

public class CityStorage {
    private ArrayList<Fruit> fruits;

    public CityStorage() {
        this.fruits = new ArrayList<>();
    }

    public void addFruits(Fruit[] fruitsToAdd) {
        for (Fruit fruit : fruitsToAdd) {
            fruits.add(fruit);
        }
    }

    public ArrayList<Fruit> shipFruits(Shop shop, int n) {
        ArrayList<Fruit> shippedFruits = new ArrayList<>();
        int count = 0;

        while (count < n && !fruits.isEmpty()) {
            shippedFruits.add(fruits.remove(0));
            count++;
        }

        shop.addFruits(shippedFruits);
        return shippedFruits;
    }


    @Override
    public String toString() {
        return "CityStorage{" +
                "fruits=" + fruits +
                '}';
    }
}
