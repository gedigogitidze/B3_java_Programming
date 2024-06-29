package day43_a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String,Double> store = new HashMap<>();
        store.put("Water",1.9);
        store.put("Coffee",2.5);
        store.put("Apple",0.99);
        store.put("Bread",2.25);
        store.put("Milk",3.89);

        //Print all the information about inventory
        /*
                Item: $itemName for $$price
                ...

         */
        //OPTION #1
        System.out.println("Store Inventory");
        for (String eachItem :store.keySet()){ // we used .keySet() to get all the keys and looped through them to get each key
            System.out.println("\tItem: "+eachItem+" for $"+ store.get(eachItem));// in print statement we used each key that we are getting each cycle and linked value to it  which is connected to that key
        }
        System.out.println("===============");
        //OPTION # 2
        System.out.println("Store Inventory");
        for(Map.Entry<String,Double> eachPair:store.entrySet() ){
            System.out.println("\tItem: "+eachPair.getKey()+" for $"+eachPair.getValue());

        }
        System.out.println("----------------");


        //How to get all values
        System.out.println(store.values());// this will return all the values as Collection

        System.out.println("------------");
        System.out.println("What item you want");
        Scanner scan = new Scanner(System.in);
        String userItem = scan.nextLine();

        System.out.println(  store.containsKey(userItem) ? userItem+ " is in stock for $"+store.get(userItem) : userItem + " is Not available in stock"      );


    }
}
