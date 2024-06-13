package day28_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>(); // capacity is 10 ==== but the size is 0
        System.out.println(group.size());
        System.out.println(group.isEmpty());
        System.out.println(group.contains("Hello"));
        System.out.println(group);

        group.add("Tom");
        group.add("Micky");
        System.out.println(group); // ArrayList Maintains the INSERTION ORDER + all elements are indexed
        System.out.println(group.get(0));
        System.out.println(group.get(1));
        //System.out.println(group.get(2)); // IndexOutOfBoundsException

        group.add(0,"Winnie");
        System.out.println(group);
        System.out.println(group.get(0));

       // group.add(5,"Winnie"); //  IndexOutOfBoundsException because size is 3 we can not add at index 5
        System.out.println(group.get(group.size()-1));
    }
}
