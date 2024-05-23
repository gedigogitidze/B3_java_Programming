package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("Bye");
        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>(listOne);     // we added elements from list1 to list2
        System.out.println(listTwo);
        listTwo.add("hola");
        System.out.println("=======================");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("One","Two","Three"));
        System.out.println(listThree);

        // ArrayList<String> listFour = new ArrayList<>("One","Two","Three")         // THIS IS NOT VALID          


    }
}
