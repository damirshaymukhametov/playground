package JAVA_1.Coursework;

public class Orange extends Fruit {
    private double peelThickness;
    private int numberOfSlices;

    public Orange(double weight, String variety, double peelThickness, int numberOfSlices) {
        super(weight, variety);
        this.peelThickness = peelThickness;
        this.numberOfSlices = numberOfSlices;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + getWeight() +
                ", variety='" + getVariety() + '\'' +
                ", peelThickness=" + peelThickness +
                ", numberOfSlices=" + numberOfSlices +
                '}';
    }
}
