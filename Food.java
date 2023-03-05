
public class Food extends Product {
    private String date;

    protected Food(String name, int cost, int quantity, String measure, String date) {
        super(name, cost, quantity, measure);
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

}