package com.practice.behavioral.iterator;

public class Item {
    String itemName;
    float itemPrice;
    public Item(String name, float price){
        this.itemName = name;
        this.itemPrice = price;
    }
    public String toString(){
        return this.itemName+":"+this.itemName;
    }
}
