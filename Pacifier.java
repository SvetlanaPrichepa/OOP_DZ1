public class Pacifier extends ChildrenThing {

    protected Pacifier(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s; Цена: %d; Количество: %d; Единица измерения: %s; Мин. возраст: %d; Гипоаллергенность: %s;",
                super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getMinAge(),
                getHypoallergenic());
    }

}