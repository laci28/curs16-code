package ro.fasttrackit.curs16.homework;

public class Fruits extends ShopItem {

    public Fruits(String name, int price, Category category) {
        super(name, price, category);
    }

    @Override
    public String toString() {
        return "Fruits{}";
    }
}
