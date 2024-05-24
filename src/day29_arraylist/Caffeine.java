package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drinks");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList<String> drinks2 = new ArrayList<>(drinks); // we created a new array list by copying aanother array List
        System.out.println(drinks2);

        String [] allDrinks = {"Coffee", "tea","Energy drinks","soda"};
        //ArrayList<String> drinks3 = new ArrayList<>(allDrinks); // NOT VALID IT HAS TO BE COLLECTION TYPE

        // going to convert it to collection by .asList
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        // another way
        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("Coffee", "tea","Energy drinks","soda"));
        System.out.println(drinks4);

        int [] num = {1,2,3,4};
        test(num);
        //test(1,2,3,4); cant do it with test because we dont have varargs
        test2(1,2,3,4); // this accepts it var args accepts all elements as array


        ArrayList<String> drinks5 = new ArrayList<>();
        //drinks5.addAll("Coffee", "tea","Energy drinks","soda") // NOT VALID
        //drinks5.addAll(allDrinks) // NOT VALID array is not collection data type
        drinks5.addAll(Arrays.asList(allDrinks)); // this is valid i converted the array into collection type

        ArrayList<String> drinks6 = new ArrayList<>();
        drinks6.addAll(Arrays.asList( "Coffee", "tea","Energy drinks","soda") ); // adds multiiple elements this way
        System.out.println(drinks6);
        drinks6.add("test1"); // this is how i add only one ..
        System.out.println(drinks6);
        drinks6.addAll(Arrays.asList("test2, test3")); // more than one at a time
        System.out.println(drinks6);

        drinks6.addAll(Arrays.asList("check1","checl2"));
        System.out.println(drinks6);

    }
    public static void test (int [] n) {

    }
    public static void test2 (int ... n) {       // this is var args

    }
}
