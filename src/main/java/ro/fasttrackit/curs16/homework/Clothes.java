package ro.fasttrackit.curs16.homework;

public class Clothes extends ShopItem {

    public Clothes(String name, int price, Category category) {
        super(name, price, category);
    }

    @Override
    public String toString() {
        return "Clothes{}";
    }
}
