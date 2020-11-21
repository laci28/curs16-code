package ro.fasttrackit.curs16.homework;

public class Electronics extends ShopItem {
    public Electronics(String name, int price, Category category) {
        super(name, price, category);
    }

    @Override
    public String toString() {
        return "Electronics{}";
    }
}
