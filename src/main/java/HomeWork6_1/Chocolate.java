package HomeWork6_1;

public class Chocolate extends Dessert{
    public Chocolate(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}
