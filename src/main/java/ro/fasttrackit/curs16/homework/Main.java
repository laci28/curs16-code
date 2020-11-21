package ro.fasttrackit.curs16.homework;

public class Main {
    public static void main(String[] args){
        Clothes clothes = new Clothes("T-shirt", 7, Category.NEW);
        Fruits fruits = new Fruits("Orange", 2, Category.ON_SALE);
        Electronics electronics = new Electronics("TV", 120, Category.REFURBISHED);
        Shop<Clothes> clothesShop = new Shop<Clothes>(clothes);
        Shop<Fruits> fruitsShop = new Shop<Fruits>(fruits);
        Shop<Electronics> electronicsShop = new Shop<Electronics>(electronics);
        Clothes clothes1 = clothesShop.getItem();

        electronicsShop.addItem(electronicsShop.getItem());
        System.out.println(clothesShop);
        System.out.println(fruitsShop);
        System.out.println(electronicsShop);
        System.out.println(clothes1);
        System.out.println(electronicsShop.findByCategory(Category.NEW));
    }
}
