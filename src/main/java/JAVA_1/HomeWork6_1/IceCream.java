package JAVA_1.HomeWork6_1;

public class IceCream extends Dessert{
    public String flavor;

    public IceCream(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }
    @Override
    public int countCallories() {
        System.out.println("Ошибка: метод countCallories не поддерживается для IceCream.");
        return -1;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", flavor='" + flavor + '\'' +
                '}';
    }

}
