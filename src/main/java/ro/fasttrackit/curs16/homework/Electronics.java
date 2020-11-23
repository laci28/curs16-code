package ro.fasttrackit.curs16.homework;

public class Electronics implements ShopItem {
    @Override
    public String name() {
        return "TV";
    }

    @Override
    public int price() {
        return 100;
    }

    @Override
    public Category category() {
        return Category.REFURBISHED;
    }

    @Override
    public String toString() {
        return "Electronics{}";
    }
}
