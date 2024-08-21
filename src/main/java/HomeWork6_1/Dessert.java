package HomeWork6_1;

public class Dessert {

    private String name;
    private double weight;

    public Dessert(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public int countCallories() {
        return 13;
    }
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + this.name + '\'' +
                ", weight=" + this.weight +
                '}';
    }
}
