package HomeWork6_1;

public class Main {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Dark Chocolate", 100),
                new Chocolate("Milk Chocolate", 150),
                new Chocolate("White Chocolate", 90),
                new Chocolate("Hazelnut Chocolate", 120),
                new Chocolate("Mint Chocolate", 110)
        };

        IceCream[] iceCreams = {
                new IceCream("Vanilla Ice Cream", 120,  "Vanilla"),
                new IceCream("Chocolate Ice Cream", 130,  "Chocolate"),
                new IceCream("Strawberry Ice Cream", 140,  "Strawberry"),
                new IceCream("Mango Ice Cream", 150,  "Mango"),
                new IceCream("Pistachio Ice Cream", 160,  "Pistachio")
        };

        Dessert[] desserts = new Dessert[chocolates.length + iceCreams.length];

        int index = 0;
        for (Chocolate chocolate : chocolates) {
            desserts[index++] = chocolate;
        }
        for (IceCream iceCream : iceCreams) {
            desserts[index++] = iceCream;
        }

        for (Dessert dessert : desserts) {
            System.out.println(dessert.toString());
            System.out.println("Calories: " + dessert.countCallories());
            System.out.println();
        }
    }

}
