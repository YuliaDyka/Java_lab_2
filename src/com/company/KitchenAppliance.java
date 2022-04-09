package com.company;

public class KitchenAppliance {

    public KitchenAppliance(){

    }
    String name;
    int price;
    int power;

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    public String show(){
       return  "Name - " + name + "\n" +
               "Price - " + price + "\n" +
               "Power - " + power + "\n";

    }

    public int compareTo(KitchenAppliance o)
    {
            return(this.power - o.power);
    }

    public int compareToPrice(KitchenAppliance o)
    {
        return(this.price - o.price);
    }
}
