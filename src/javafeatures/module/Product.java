package javafeatures.module;

import java.util.ArrayList;

public class Product {
private String name;
private float price;
private int amount;

    public Product(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String[] listOfProducts(){
        return new String[2];
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
