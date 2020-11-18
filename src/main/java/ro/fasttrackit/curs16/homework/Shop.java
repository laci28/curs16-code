package ro.fasttrackit.curs16.homework;

import java.util.List;

public class Shop<T> implements ShopItem {
    private Clothes clothes;
    private Electronics electronics;
    private Fruits fruits;
    private final T item;

    public Clothes getClothes() {
        return clothes;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public Fruits getFruits() {
        return fruits;
    }

    public Shop(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "item=" + item +
                '}';
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public Category category() {
        return null;
    }
}
