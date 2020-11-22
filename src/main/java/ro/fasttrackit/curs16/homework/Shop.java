package ro.fasttrackit.curs16.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private List<T> list = new ArrayList<T>();
    private final T item;

    public Shop(T item) {
        this.item = item;
    }

    public List<T> getList() {
        return new ArrayList<T>(list);
    }

    public T getItem() {
        return item;
    }

    public void addItem(T item) {
        list.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<T>();
        for (ShopItem shopItem : list) {
            if (shopItem.getCategory().equals(cat)) {
                result.add((T) shopItem);
            }
        }
        return result;
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

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                ", item=" + item +
                '}';
    }
}
