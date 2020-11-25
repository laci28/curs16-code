package ro.fasttrackit.curs16.homework;

import java.util.*;

public class Shop<T extends ShopItem> {
    private List<T> list = new ArrayList<T>();

    public Shop(Collection<T> item){
        if (list != null) {
            this.list.addAll(item);
        }
    }

    public List<T> getList() {
        return new ArrayList<T>(list);
    }

    public void addItem(T item) {
        Optional<T> itm = Optional.ofNullable(item);
        if (itm.isPresent()) {
            list.add(item);
        }
    }

    public List<T> findByCategory(Category category) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        return result;
    }
    public List<T> findWithLowerPrice(int max) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (item.getPrice() <= max) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {

        for (T item : list) {
            if (item.getName().equalsIgnoreCase(name)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
        return Optional.empty();
    }

    List<T> getAllItems() {
        return new ArrayList<T>(list);
    }
}
