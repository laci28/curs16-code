package ro.fasttrackit.curs16.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T> implements ShopItem {
    List<T> list = new ArrayList<T>();
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

    public void addItem(T item) {
        //List<T> list = new ArrayList<T>();
        list.add(item);
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
/*
    public List<T> findByCategory(Category cat) {

        return null;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        return null;
    }

    public Optional<T> findByName(String name) {
        return null;
    }

    public Optional<T> removeItem(String name) {
        return null;
    }
*/
}
