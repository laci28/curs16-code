package ro.fasttrackit.curs16.homework;

public class Clothes implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Clothes(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return "T-shirt";
    }

    @Override
    public int price() {
        return 10;
    }

    @Override
    public Category category() {
        return Category.NEW;
    }

    @Override
    public String toString() {
        return "Clothes: " + name() + ", " + price() + ", "  + category();
    }
}
