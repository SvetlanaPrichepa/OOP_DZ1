
public class ToaletPaper extends Gigien {
    private int layers;

    protected ToaletPaper(String name, int cost, int quantity, String measure, int size, int layers) {
        super(name, cost, quantity, measure, size);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Цена: %d; Количество: %d; Единица измерения: %s; Количество в уп.: %d; Кол. слоев: %d",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize(),
                this.layers);
    }

}
