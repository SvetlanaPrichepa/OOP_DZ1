
public class Main {
    private static void ShowProducts(Product[] all) {
        for (Product product : all) {
            System.out.println(product);
            System.out.println("----");
        }
    }

    public static void main(String[] args) {
        Product milk = new Milk("Молоко Гродненское", 60, 6, "Литр", "1 год", 2);
        Product soda = new Drink("Напиток Sprite", 56, 12, "Литр", 2);
        Product bread = new Bread("Хлеб Новогрудский", 45, 1, "шт", "32 дня", "1 сорт");
        Product egg = new Egg("Яйца Золотые", 82, 10, "шт", "3 нед", 10);
        Product mask = new Mask("Маска Гигиеническая", 455, 36, "шт", 12);
        Product paper = new ToaletPaper("Туалетная бумага Zeva", 275, 12, "шт", 12, 2);
        Product diaper = new Diapers("Подгузники Pampers", 200, 72, "шт.", 2, "да", 12, 5, 7, "Дышаший");
        Product pacifier = new Pacifier("Соска", 134, 1, "шт.", 1, "да");

        Product[] all = new Product[] { milk, soda, bread, egg, mask, paper, diaper, pacifier };

        ShowProducts(all);
    }

}
