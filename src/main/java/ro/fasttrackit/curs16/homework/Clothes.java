package ro.fasttrackit.curs16.homework;

public class Clothes implements ShopItem {
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
}
