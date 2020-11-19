package ro.fasttrackit.curs16.homework;

public class Main {
    public static void main(String[] args){
        Clothes clothes = new Clothes("T-shirt", 7, Category.NEW);
        Fruits fruits = new Fruits();
        Electronics electronics = new Electronics();
        Shop<Clothes> clothesShop = new Shop<Clothes>(clothes);
        Shop<Fruits> fruitsShop = new Shop<Fruits>(fruits);
        Shop<Electronics> electronicsShop = new Shop<Electronics>(electronics);
        electronicsShop.addItem(electronics);
        System.out.println(clothesShop);
        System.out.println(fruitsShop);
        System.out.println(electronicsShop);
        System.out.println(electronics.name());
    }
}
