package com.company;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("-----Lab2------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Mixer mixer = new Mixer("Mixer-2000", 1200, 500, 1000);
        Mixer mixer_2 = new Mixer("Mixer_home-235", 1000, 700, 1000);
        FoodProcessor foodProcessor = new FoodProcessor("Food processor-3000", 2000, 600);
        Oven oven = new Oven("Oven 4000", 6500, 1000);


        ArrayList<KitchenAppliance> kitchenAppliances = new ArrayList<KitchenAppliance>();
        kitchenAppliances.add(mixer);
        kitchenAppliances.add(mixer_2);
        kitchenAppliances.add(foodProcessor);
        kitchenAppliances.add(oven);

        for(KitchenAppliance i: kitchenAppliances){
            System.out.println(i.show());
        } ;
        System.out.println(" ----------------------------------------- " + "\n");
        System.out.println("Please enter the name of kitchen appliance: ");
        String searchName = br.readLine();

        ArrayList<KitchenAppliance> output = new ArrayList<KitchenAppliance>();

        for(KitchenAppliance item: kitchenAppliances)  {
            if(item.name.contains(searchName)) {
               output.add(item);
            }
        }

       System.out.println("----Ascending by power----");
       Collections.sort(output, (a, b) -> a.compareTo(b));
       for(KitchenAppliance item: output){
           System.out.println(item.show());
       }

        System.out.println("----Descending by power----");
        Collections.sort(output, (a, b) -> b.compareTo(a));
        for(KitchenAppliance item: output){
            System.out.println(item.show());
        }

        System.out.println("------------");
        System.out.println("----Sorting by price ascend----");
        Collections.sort(kitchenAppliances, (a, b) -> a.compareToPrice(b) );
        for(KitchenAppliance i: kitchenAppliances) {
            System.out.println(i.show());
        }

        System.out.println("------------");
        System.out.println("----Sorting by price descend----");
        Collections.sort(kitchenAppliances, (a, b) -> b.compareToPrice(a) );
        for(KitchenAppliance i: kitchenAppliances) {
            System.out.println(i.show());
        }
    }
}
