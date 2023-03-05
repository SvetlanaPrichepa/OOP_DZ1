
public class Bread extends Food {
    private String type;

    protected Bread(String name, int cost, int quantity, String measure, String date, String type) {
        super(name, cost, quantity, measure, date);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Цена: %d; Количество: %d; Единица измерения: %s; Срок годности: %s; Тип муки: %s;",
                super.getName(),
                super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.type);
    }

}