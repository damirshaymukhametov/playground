package Coursework;

public class Fruit extends Ware {
    private String variety;

    public Fruit(double weight, String variety) {
        super(weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }
}
