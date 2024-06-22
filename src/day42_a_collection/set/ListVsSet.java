package day42_a_collection.set;

import com.sun.source.tree.Tree;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(); // Duplicates are ok, insertion order kept
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(0)); // Since List, works with indexes, I can get the elements like this.
        System.out.println(list.get(list.size()-1));
        System.out.println("--------");


        Set <Integer> set = new HashSet<>(); // duplicates are not ok, insertion order is not kept
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10); // set does not allow duplicate
        set.add(4);// does not allow duplicate
        System.out.println(set);
      //  System.out.println(set.get(0));
      //  System.out.println(set.get(set.size()-1));
        // since Set does not have indexes, we can not get the elements in this way

        //Q: How to get elements ?
        //A: we can loop through Set and get the element. Lets, say we want to get element 6

        for (Integer each: set) {
            if (each == -5){
                System.out.println(each);
            }

        }
        for (Integer each: set) {
                System.out.println(each);
            }
        //Q: how to sort my HashSet?
        Set<Integer>sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

        //Q; Remove duplicates from list
        // - sort - treeSet
        // - no sort - HashSet, LinkedHashSet
        System.out.println(list);
        System.out.println(new LinkedHashSet<>(list));


        // Q: You have an array of int: Remove Duplicates and sort them
        Integer [] a = {2,4,23,76,2,345,2,8,4,-3,2,-5};
        //ArrayList<Integer> l =  Arrays.asList(a);
        // Set <Integer> s = new TreeSet <> (l);
        System.out.println(     new TreeSet<>(     Arrays.asList(a)     )              ); // converted array into array list and took it into TreeSet to make it none duplicate and sorted in ascending order

        String s = "aaaabbbbcccccdddddeeeeeee";
            System.out.println(
                    new HashSet<>(    Arrays.asList  (s.split("") )  ).toString().replace("[","").replace("]","").replace(", ","")


        );
            /*
            Above we converted String into an array
            then we converted String array into List of String
            then we converted List of String into Set of String - which removed duplicates
            then we did String manipulation to remove "[" and ']" and ", " also this into empty space
             */

        }

    }

