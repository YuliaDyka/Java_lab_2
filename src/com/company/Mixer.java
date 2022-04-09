package com.company;

public class Mixer extends KitchenAppliance{
    public Mixer(String name, int price, int power, int speed){
        this.name = name;
        this.price = price;
        this.power = power;
        this.speed = speed;
    }

    int speed;

    @Override
    public String show(){
        return  "Name - " + name + "\n" +
                "Price - " + price + "\n" +
                "Power - " + power + "\n" +
                "Speed - " + speed + "\n";

    }



}
