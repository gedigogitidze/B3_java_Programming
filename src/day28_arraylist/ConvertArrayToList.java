package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        // int [] arr = {1,2,3}; // array can work with both primitive and not primitive but not ArrayList

        Integer [] arr = {1,2,3,4,5,6,7,8,9};// array can work with both primitive and not primitive
                                 // we made an INTEGER array

        Arrays.asList(arr); // Converted the array into a Collection type / collection data Structure (ArrayList)

        // ArrayList <Integer> l1 = Arrays.asList(arr); // this is not valid way to use it
        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(arr)); // created an ArrayList with values from array which was converted into collection Type
        System.out.println(l1);


        // Creating an ArrayList with some initial value
        ArrayList <Integer> l2 = new ArrayList<>(Arrays.asList(12,453,65,23,87,4,23,6));
        System.out.println(l2);

    }
}
