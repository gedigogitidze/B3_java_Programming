package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Micky");
        names.add("Mouse");
        System.out.println(names);


        // To be able to use Iterator, i need to first declare Iterator
        Iterator<String> it = names.iterator();

        System.out.println(it.next()); // move the cursor /pin, and return the element
        System.out.println(it.next()); // move the cursor /pin, and return the element
        System.out.println(it.next()); // move the cursor /pin, and return the element
        System.out.println(it.next()); // move the cursor /pin, and return the element
        System.out.println(it.next()); //NoSuchElementException -  move the cursor /pin, and return the element - there is no element anymore, so exception happens





    }
}
