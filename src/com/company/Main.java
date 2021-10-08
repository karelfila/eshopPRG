package com.company;

public class Main {

    public static void main(String[] args) {

        Produkt alzaBox1 = new Produkt("Alza Box 1", 30000, "Alza Box 1 je revoluční PC, postavený u nás na Alze");
        Produkt alzaBox2 = new Produkt("Alza Box 2", 40000, "Alza Box 2 je vylepšený Alza Box 1");

        Produkt iPhoneX = new Produkt("iPhoneX", 25000, "Iphone X je spolehlivý chytrý telefon");
        Produkt iPhoneXR = new Produkt("iPhoneXR", 18000, "Iphone XR je spolehlivý chytrý telefon");

        Eshop alza = new Eshop("Alza.cz");


        //AKCE

        //add
        alza.addToStock(alzaBox1);
        alza.addToStock(alzaBox2);
        alza.addToStock(alzaBox2);
        alza.addToStock(iPhoneX);
        alza.addToStock(iPhoneX);
        alza.addToStock(iPhoneXR);
        alza.addToStock(iPhoneXR);
        alza.addToStock(iPhoneXR);

        //sell
        alza.sell(alzaBox1);
        alza.sell(alzaBox2);
        alza.sell(alzaBox2);
        alza.sell(iPhoneX);
        alza.sell(iPhoneXR);

        //KONEC AKCÍ

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Alza: " + alza.getMoney() + "kč");

    }
}
