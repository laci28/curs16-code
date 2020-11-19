package ro.fasttrackit.curs16.homework;

public class Fruits implements ShopItem {
    @Override
    public String name() {
        return "Orange";
    }

    @Override
    public int price() {
        return 2;
    }

    @Override
    public Category category() {
        return Category.ON_SALE;
    }

    @Override
    public String toString() {
        return "Fruits: " + name() + ", " + price() + ", "  + category();
    }
}
