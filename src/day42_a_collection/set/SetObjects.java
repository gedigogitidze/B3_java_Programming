package day42_a_collection.set;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);// null is accepted
        set.add("hello");
        set.add("14.5");
        set.add("400");
        set.add("hello");// Set does not allow duplicates
        set.add("%");
        System.out.println(set);// insertion order is not kept

        System.out.println("==================");

        Set<String> set2 = new LinkedHashSet<>(); // reference is set but object is LinkedHashSet
        set2.add(null);// null is accepted
        set2.add("hello");
        set2.add("14.5");
        set2.add("400");
        set2.add("hello");// Set does not allow duplicates
        set2.add("%");
        System.out.println(set2);// insertion order is kept............HERE
        System.out.println("-------------------");

        Set<String> set3 = new TreeSet<>() {};

        //this sorts
    //    set3.add(null);// null is  NOT accepted
        set3.add("hello");
        set3.add("14.5");
        set3.add("400");
        set3.add("hello");// set does not allow duplicates
        set3.add("%");
        set3.add("400");
        set3.add("ZOMBIE");
        System.out.println(set3);// insertion order is not kept it sorts by ascending order ascii table




    }
}
