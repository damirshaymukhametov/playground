package JAVA_1.Coursework;

public class Apple extends Fruit {
    private boolean isWaxed;
    private boolean suitableForCider;

    public Apple(double weight, String variety, boolean isWaxed, boolean suitableForCider) {
        super(weight, variety);
        this.isWaxed = isWaxed;
        this.suitableForCider = suitableForCider;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + getWeight() +
                ", variety='" + getVariety() + '\'' +
                ", isWaxed=" + isWaxed +
                ", suitableForCider=" + suitableForCider +
                '}';
    }

}
