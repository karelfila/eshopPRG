package com.company;

import java.util.ArrayList;

public class Eshop {

    public void addToStock(Produkt newProduct) {
        products.add(newProduct);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Na prodejně je nové zboží " + newProduct.getName() + " | " + newProduct.getNote());

    }
    public void sell(Produkt sellProduct) {
        if(products.contains(sellProduct)) {
            money += sellProduct.getPrice();
            products.remove(sellProduct);
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("Z prodeje jsme odebrali " + sellProduct.getName() + " | " + sellProduct.getNote());

        } else {
            System.out.println("Zboží " + sellProduct.getName() + " nemůžete prodat, protože ho nemáte na skladě.");
        }
    }

    private String shopName;
    private ArrayList<Produkt> products = new ArrayList<>();
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Eshop(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<Produkt> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Produkt> products) {
        this.products = products;
    }

}