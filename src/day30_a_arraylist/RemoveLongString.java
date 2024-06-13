package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static ArrayList<String> keepLong(ArrayList<String> list, int num){ //"one","two","three","four","five","six")
        ArrayList <String> updatedList = new ArrayList<>(list);
        updatedList.removeIf(each -> each.length() < num);


        return  updatedList;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        System.out.println(keepLong(list, 4));
        System.out.println(keepLong(list, 5));
        System.out.println(keepLong(list, 10));
    }
}
