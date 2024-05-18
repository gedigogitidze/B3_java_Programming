package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        System.out.println(list.size());

        // Let's add some data in it
        list.add("water");
        // list.add(3); // INVALID , because datatype of my ArrayList is String
        list.add("bread");
        list.add("juice");
        list.add("fruit");
        System.out.println(list);//[water, bread, Juice, fruit]

        list.add(1,"rice");
        System.out.println(list);// [water, rice, bread, Juice, fruit]

        list.remove(0);
        System.out.println(list); //[rice, bread, Juice, fruit]

        System.out.println(list.remove(0));
        System.out.println(list); // [bread, Juice, fruit]

        //remove last one.
        list.remove(list.size()-1);
        System.out.println(list); // [bread, Juice]

        //list.remove(12);//indexOutOfBounds


        //NOW REEEEEEMOVE BY ELEMENT
        list.remove("juice");
        System.out.println(list); // [bread]
        System.out.println(list.remove("Water")); // this will return false because there was no match found

        list.add("banana");
        list.add("banana"); // here i have 2 bananas
        System.out.println(list);// [bread, banana, banana]

        list.remove("banana"); // it removes the first match only
        System.out.println(list);

    }
}
