
public class Egg extends Food {
    private int packages;

    protected Egg(String name, int cost, int quantity, String measure, String date, int packages) {
        super(name, cost, quantity, measure, date);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Цена: %d; Количество: %d; Единица измерения: %s; Срок годности: %s; Количество в уп.: %d;",
                super.getName(),
                super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.packages);
    }

}