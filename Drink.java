
public class Drink extends Product {
    private int volume;

    protected Drink(String name, int cost, int quantity, String measure, int volume) {
        super(name, cost, quantity, measure);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

}