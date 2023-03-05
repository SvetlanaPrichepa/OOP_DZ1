public class Mask extends Gigien {

    protected Mask(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure, size);
    }

    @Override
    public String toString() {
        return String.format("Название: %s; Цена: %d; Количество: %d; Единица измерения: %s; Количество в уп.: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize());
    }

}